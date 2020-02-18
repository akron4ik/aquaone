package aquaone.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pro.aquaone.model.Cart;
import pro.aquaone.service.cart.CartService;
import java.time.LocalDateTime;
import static aquaone.CartTestData.*;


public class CartServiceTest extends AbstractServiceTest{

    @Autowired
    CartService service;

    @Test
    void create() throws Exception {
        Cart newCart = new Cart(null,  LocalDateTime.of(2019, 12, 6,  0, 10), "1234567", "Ivanov" , 1800, "Test");
        Cart created = service.create(newCart);
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
        Cart cart = service.get(CART_1_ID);
        assertMatch(cart, CART1);
    }

    @Test
    void delete() throws Exception {
        service.delete(CART_1_ID);
        assertMatch(service.getAll(), CART6,CART4,  CART3,  CART2,  CART5);
    }

    @Test
    void getAll() throws Exception {
        assertMatch(service.getAll(), CART6,CART4,  CART3,  CART2,  CART5, CART1);
    }




}
