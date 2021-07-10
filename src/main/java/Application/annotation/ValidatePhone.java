package Application.annotation;

import Application.validator.PhoneValidator;
import java.lang.annotation.ElementType.*;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = {PhoneValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidatePhone {

    String message() default "Phone format is wrong";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
