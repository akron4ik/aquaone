package pro.aquaone.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pro.aquaone.View;
import pro.aquaone.model.Cart;
import pro.aquaone.service.cart.CartService;
import pro.aquaone.web.SecurityUtil;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;


@RestController
@RequestMapping(value = "/cart", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartUIController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private CartService service;

    @GetMapping(value = "/{id}")
    public Cart get(@PathVariable int id) {
        int userId = SecurityUtil.authUserId();
        log.info("get cart {} with user {}", id, userId);
       return service.get(id, userId);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        int userId = SecurityUtil.authUserId();
        log.info("delete cart {} with user {}", id, userId);
        service.delete(id, userId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cart> createWithLocation(@Validated(View.Web.class) @RequestBody Cart cart) {
        int userId = SecurityUtil.authUserId();
        Cart created = service.create(cart, userId);
        URI uriOfNewResource = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/cart" + "/{id}")
                .buildAndExpand(created.getId()).toUri();
        return ResponseEntity.created(uriOfNewResource).body(created);
    }


    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@Validated(View.Web.class) @RequestBody Cart cart, @PathVariable int id) {
        service.update(cart, id);
    }

    @GetMapping(value = "/filter")
    public List<Cart> getBetween( @RequestParam(required = false) LocalDate startDate,
                                  @RequestParam(required = false) LocalDate endDate){
        int userId = SecurityUtil.authUserId();
        log.info("getBetween dates({} - {}) for user {}", startDate, endDate, userId);
        return service.getBetweenDatesWithUserId(startDate, endDate, userId);
    }











}
