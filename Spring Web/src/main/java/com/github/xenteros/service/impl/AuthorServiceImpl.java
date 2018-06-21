package com.github.xenteros.service.impl;

import com.github.xenteros.exception.ValidationError;
import com.github.xenteros.exception.ValidationException;
import com.github.xenteros.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl {

    public Author create(String firstName, String lastName) {
        validate(firstName, lastName);
        return null;
    }

    private void validate(String firstName, String lastName) {
        List<ValidationError> errors = new ArrayList<>();
        if (firstName == null) {
            ValidationError error = new ValidationError("firstName", "May not be null");
            errors.add(error);
        } else if (firstName.isEmpty()) {
            ValidationError error = new ValidationError("firstName", "May not be empty");
            errors.add(error);
        }
        if (lastName == null) {
            ValidationError error = new ValidationError("lastName", "May not be null");
            errors.add(error);
        } else if (lastName.isEmpty()) {
            ValidationError error = new ValidationError("lastName", "May not be empty");
            errors.add(error);
        }
        if (!errors.isEmpty()) {
            throw new ValidationException(errors);
        }

    }

}
