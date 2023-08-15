package spring.security.validator.password;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import spring.security.dto.request.UserRequestDto;

public class MatchPasswordValidator implements ConstraintValidator<MatchPassword, Object> {
    @Override
    public void initialize(MatchPassword constraintAnnotation) {
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        if (o instanceof UserRequestDto) {
            UserRequestDto userRequestDto = (UserRequestDto) o;
            String password = userRequestDto.getPassword();
            String repeatPassword = userRequestDto.getRepeatPassword();

            return password != null && password.equals(repeatPassword);
        }
        return true;
    }
}
