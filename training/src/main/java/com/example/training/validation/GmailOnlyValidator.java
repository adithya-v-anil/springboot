package com.example.training.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GmailOnlyValidator implements ConstraintValidator<GmailOnly, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return true; // NotBlank will handle null
        return value.endsWith("@gmail.com");
    }
}
