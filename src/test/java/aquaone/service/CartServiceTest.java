package aquaone.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pro.aquaone.model.Cart;
import pro.aquaone.service.cart.CartService;

import java.time.LocalDateTime;

import static aquaone.CartTestData.*;
import static aquaone.UserTestData.USER2;

public class CartServiceTest extends AbstractServiceTest{

    @Autowired
    CartService service;

    @Test
    void create() throws Exception {
        Cart newCart = new Cart(null,  LocalDateTime.of(2019, 12, 6,  0, 10), USER2, 1800);
        int userId = USER2.getId();
        Cart created = service.create(newCart, userId);
        assertMatch(newCart, created);
        assertMatch(service.getAll(), CART6, created, CART4, CART3, CART2, CART5, CART1);

    }
}
