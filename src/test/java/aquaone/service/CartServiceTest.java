package aquaone.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pro.aquaone.model.Cart;
import pro.aquaone.service.cart.CartService;
import pro.aquaone.util.exception.NotFoundException;

import java.time.LocalDateTime;
import java.util.List;

import static aquaone.CartTestData.*;
import static aquaone.UserTestData.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void get() throws Exception {
        Cart cart = service.get(CART_1_ID);
        assertMatch(cart, CART1);
    }

    @Test
    void getWithUserId() throws Exception {
        Cart cart = service.get(CART_1_ID, USER_ID);
        assertMatch(cart, CART1);
    }

    @Test
    void delete() throws Exception {
        service.delete(CART_1_ID, USER_ID);
        assertMatch(service.getAll(), CART6,CART4,  CART3,  CART2,  CART5);
    }

    @Test
    void getAll() throws Exception {
        assertMatch(service.getAll(), CART6,CART4,  CART3,  CART2,  CART5, CART1);
    }

    @Test
    void getAllByUserId() throws Exception {
        assertMatch(service.getAllByUserId(USER2_ID), CART6, CART5);
    }

    @Test
    void getBetweenDatesWithUserId() throws Exception {
        LocalDateTime startDateTime = LocalDateTime.of(2019, 12, 2,  11, 30);
        LocalDateTime endDateTime = LocalDateTime.of(2019, 12, 3,  20, 30);
        List<Cart> carts = service.getCartsBetweenDatesByUserId(startDateTime, endDateTime, USER_ID);
        assertMatch(carts, CART2);
    }

    @Test
    void getBetweenDates() throws Exception {
        LocalDateTime startDateTime = LocalDateTime.of(2019, 12, 2,  0, 0);
        LocalDateTime endDateTime =  LocalDateTime.of(2019, 12, 6,  0, 0);
        List<Cart> carts = service.getCartsBetweenDates(startDateTime, endDateTime);
        assertMatch(carts, CART2, CART3, CART4);

    }

    @Test
    void getNotFound() throws Exception {
        assertThrows(NotFoundException.class, () ->
                service.get(1));
    }
}
