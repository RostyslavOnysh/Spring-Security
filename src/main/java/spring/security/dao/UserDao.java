package spring.security.dao;

import java.util.Optional;
import spring.security.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
