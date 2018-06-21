package com.github.xenteros.exception;

public class ValidationError {

    private String field;
    private String description;

    public ValidationError() {
    }

    public ValidationError(String field, String description) {
        this.field = field;
        this.description = description;
    }

    public String getField() {
        return field;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("{\"field\":\"%s\"," +
                "\"description\":\"%s\"}", field, description);
    }
}
