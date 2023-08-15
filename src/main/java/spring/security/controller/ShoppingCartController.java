package spring.security.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.security.dto.response.ShoppingCartResponseDto;
import spring.security.exception.DataProcessingException;
import spring.security.model.ShoppingCart;
import spring.security.model.User;
import spring.security.service.MovieSessionService;
import spring.security.service.ShoppingCartService;
import spring.security.service.UserService;
import spring.security.service.mapper.ResponseDtoMapper;

@RestController
@RequestMapping("/shopping-carts")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;
    private final MovieSessionService movieSessionService;
    private final UserService userService;
    private final ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart>
            shoppingCartResponseDtoMapper;

    public ShoppingCartController(ShoppingCartService shoppingCartService,
                                  UserService userService,
                                  MovieSessionService movieSessionService,
                                  ResponseDtoMapper<ShoppingCartResponseDto, ShoppingCart>
                                          shoppingCartResponseDtoMapper) {
        this.shoppingCartService = shoppingCartService;
        this.userService = userService;
        this.movieSessionService = movieSessionService;
        this.shoppingCartResponseDtoMapper = shoppingCartResponseDtoMapper;
    }

    @PutMapping("/movie-sessions")
    public void addToCart(Authentication authentication, @RequestParam Long movieSessionId) {
        shoppingCartService.addSession(
                movieSessionService.get(movieSessionId),
                userService.findByEmail(authentication.getName())
                        .orElseThrow(
                                () -> new DataProcessingException("Can`t get user by email"
                                        + authentication.getName())));
    }

    @GetMapping("/by-user")
    public ShoppingCartResponseDto getByUser(Authentication authentication) {
        User user = userService.findByEmail(
                authentication.getName()).orElseThrow(() -> new DataProcessingException("Can`t"
                + " get user by email " + authentication.getName()));
        return shoppingCartResponseDtoMapper.mapToDto(shoppingCartService.getByUser(user));
    }
}
