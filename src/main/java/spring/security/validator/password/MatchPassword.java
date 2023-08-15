package spring.security.validator.password;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE,ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = MatchPasswordValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MatchPassword {
    String message() default "Password don`t match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
