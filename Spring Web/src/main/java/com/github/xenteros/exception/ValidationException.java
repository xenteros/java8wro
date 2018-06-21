package com.github.xenteros.exception;

import java.util.List;

public class ValidationException extends RuntimeException {

    private List<ValidationError> errors;

    public ValidationException(List<ValidationError> errors) {
        this.errors = errors;
    }

    public List<ValidationError> getErrors() {
        return errors;
    }
}
