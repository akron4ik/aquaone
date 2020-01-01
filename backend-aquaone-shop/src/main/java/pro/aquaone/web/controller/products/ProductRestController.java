package pro.aquaone.web.controller.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pro.aquaone.AuthorizedUser;
import pro.aquaone.model.Product;
import pro.aquaone.service.product.ProductService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
@RequestMapping(value = "/rest/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductRestController extends AbstractProductController {

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getAll() {
        return super.getAll();
    }
   /*@GetMapping
   public String products(ModelMap model) {
       model.addAttribute("products", super.getAll());
       return "profile";
   }*/






}
