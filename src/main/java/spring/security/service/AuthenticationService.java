package spring.security.service;

import spring.security.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
