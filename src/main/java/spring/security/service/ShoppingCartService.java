package spring.security.service;

import spring.security.model.MovieSession;
import spring.security.model.ShoppingCart;
import spring.security.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
