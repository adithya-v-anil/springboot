package com.example.training.validation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = AddressValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } ) 
@Retention(RetentionPolicy.RUNTIME) 
public @interface Address {
     
    public String message() default "You address must contains india"; 
    public Class<?>[] groups() default {}; 
    public Class<? extends Payload>[] payload() default {}; 
} 