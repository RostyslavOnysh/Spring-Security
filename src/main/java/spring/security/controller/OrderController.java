package spring.security.controller;

import java.util.List;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.security.dto.response.OrderResponseDto;
import spring.security.exception.DataProcessingException;
import spring.security.model.Order;
import spring.security.model.ShoppingCart;
import spring.security.service.OrderService;
import spring.security.service.ShoppingCartService;
import spring.security.service.UserService;
import spring.security.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final ShoppingCartService shoppingCartService;
    private final OrderService orderService;
    private final UserService userService;
    private final ResponseDtoMapper<OrderResponseDto, Order> orderResponseDtoMapper;

    public OrderController(ShoppingCartService shoppingCartService,
                           OrderService orderService,
                           UserService userService,
                           ResponseDtoMapper<OrderResponseDto, Order> orderResponseDtoMapper) {
        this.shoppingCartService = shoppingCartService;
        this.orderService = orderService;
        this.userService = userService;
        this.orderResponseDtoMapper = orderResponseDtoMapper;
    }

    @PostMapping("/complete")
    public OrderResponseDto completeOrder(Authentication authentication) {
        ShoppingCart cart = shoppingCartService
                .getByUser(userService
                        .findByEmail(authentication.getName())
                        .orElseThrow(() -> new DataProcessingException("Can`t get user by email"
                                + authentication.getName())));
        return orderResponseDtoMapper.mapToDto(orderService.completeOrder(cart));
    }

    @GetMapping
    public List<OrderResponseDto> getOrderHistory(Authentication authentication) {
        return orderService.getOrdersHistory(userService.findByEmail(authentication.getName())
                        .orElseThrow(() -> new DataProcessingException("Can`t get user by email"
                                + authentication.getName())))
                .stream()
                .map(orderResponseDtoMapper::mapToDto)
                .toList();
    }
}
