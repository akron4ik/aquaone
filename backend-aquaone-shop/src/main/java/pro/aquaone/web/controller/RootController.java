package pro.aquaone.web.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*@Controller
public class RootController {

    @GetMapping("/")
    public String root() {
        return "/app/public/index.html";
    }

//    @Secured("ROLE_ADMIN")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/users")
    public String getUsers() {
        return "users";
    }

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping("/products")
    public String  getProducts() {
        return "/WEB-INF/jsp/index.html";
    }
}*/
