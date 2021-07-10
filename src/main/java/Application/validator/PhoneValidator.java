package Application.validator;

import Application.annotation.ValidatePhone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<ValidatePhone, String> {


    @Override
    public void initialize(ValidatePhone constraintAnnotation) {
    }

    @Override
    public boolean isValid(String field, ConstraintValidatorContext context) {
        return field != null && field.matches("[0-9]+")
                && (field.length() > 8) && (field.length() < 14);
    }
}
