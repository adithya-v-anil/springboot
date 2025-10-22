package com.example.training.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = GmailOnlyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GmailOnly {
    String message() default "Email must be a Gmail address";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
