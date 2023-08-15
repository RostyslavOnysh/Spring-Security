package spring.security.validator.email;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
    String message() default "invalid Email";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
