package com.example.training.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<Address, String> {
 
	@Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
        s = s.toLowerCase();
        boolean result = s.contains("india");
        return result;
    }

}
