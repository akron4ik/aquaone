package pro.aquaone.web.controller.products;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pro.aquaone.View;
import pro.aquaone.model.Category;
import pro.aquaone.model.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/admin/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminProductController extends AbstractProductController {



    @Override
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        super.delete(id);
    }

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getAll() {
        return super.getAll();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void createOrUpdate(@Validated(View.Web.class)Product product) {
        if(product.isNew()) {
             super.create(product);
        } else {
            super.update(product, product.getId());
        }
    }
}
