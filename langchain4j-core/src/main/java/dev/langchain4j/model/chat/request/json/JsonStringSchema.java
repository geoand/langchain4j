package dev.langchain4j.model.chat.request.json;

import dev.langchain4j.Experimental;

import java.util.Objects;

import static dev.langchain4j.internal.Utils.quoted;

@Experimental
public class JsonStringSchema implements JsonSchemaElement {

    private final String description;
    private final String format;

    public JsonStringSchema() {
        this.description = null;
        this.format = null;
    }

    public JsonStringSchema(Builder builder) {
        this.description = builder.description;
        this.format = builder.format;
    }

    public String description() {
        return description;
    }

    public String getFormat() {
        return format;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String description;
        private String format;

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder format(String format) {
            this.format = format;
            return this;
        }

        public JsonStringSchema build() {
            return new JsonStringSchema(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonStringSchema that = (JsonStringSchema) o;
        return Objects.equals(description, that.description) && Objects.equals(format, that.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, format);
    }

    @Override
    public String toString() {
        return "JsonStringSchema{" +
                "description='" + quoted(description) + '\'' +
                ", format='" + quoted(format) + '\'' +
                '}';
    }
}
