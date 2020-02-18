package pro.aquaone.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pro.aquaone.LoggedUser;
import pro.aquaone.View;
import pro.aquaone.model.Cart;
import pro.aquaone.service.cart.CartService;
import pro.aquaone.service.user.UserService;
import pro.aquaone.to.CartTo;
import pro.aquaone.to.ProductTo;
import pro.aquaone.to.UserTo;
import pro.aquaone.util.SendEmailUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping(value = "/rest/cart", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CartService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createWithLocation(@RequestBody CartTo cartTo) {
        UserTo userTo = cartTo.getUserTo();
        ProductTo[] products = cartTo.getProducts();
        String comment = cartTo.getComment();
        int totalPrice = 0;
        for (ProductTo p: products) {
            totalPrice += p.getSubprice();
        }
        Cart cart = new Cart();
        cart.setPrice(totalPrice);
        LocalDateTime localDateTime = LocalDateTime.now();
        cart.setDate(localDateTime);
        cart.setPhone(userTo.getPhone());
        cart.setSurname(userTo.getSurname());
        cart.setComment(comment);
        service.create(cart);
        SendEmailUtil sendEmailUtil = new SendEmailUtil();
        sendEmailUtil.createAndSendMessage(userTo, products, comment);
        return "Success";
    }

    @GetMapping(value = "/{id}")
    public Cart get(@PathVariable int id) {
        int userId = LoggedUser.id();
        log.info("get cart {} with user {}", id, userId);
       return service.get(id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        int userId = LoggedUser.id();
        log.info("delete cart {} with user {}", id, userId);
        service.delete(id);
    }












}
