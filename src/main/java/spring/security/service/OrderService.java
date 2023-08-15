package spring.security.service;

import java.util.List;
import spring.security.model.Order;
import spring.security.model.ShoppingCart;
import spring.security.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
