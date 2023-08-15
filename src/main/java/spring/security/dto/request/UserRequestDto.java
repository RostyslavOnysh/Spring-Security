package spring.security.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import spring.security.validator.password.MatchPassword;

@MatchPassword
public class UserRequestDto {
    @Email
    @NotNull
    private String email;
    @NotNull
    @Size(min = 6)
    private String password;
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
