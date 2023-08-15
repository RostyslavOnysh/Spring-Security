package spring.security.dao;

import java.util.List;
import spring.security.model.Order;
import spring.security.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
