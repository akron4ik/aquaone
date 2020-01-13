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

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
@RequestMapping(value = "/rest/admin/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminProductRestController extends AbstractProductController {

    @Override
    @GetMapping(value = "/{id}")
    public Product get(@PathVariable int id) {
        return super.get(id);
    }

    @GetMapping(value = "/categories")
    public List<Category> getCategories(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1, "Вода"));
        list.add(new Category(2, "Посуда"));
        list.add(new Category(3, "Кулеры"));
        return list;
    }

    @GetMapping(value = "/categories/{id}")
    public List<Product> getProductByCategoryId(@PathVariable Integer id){
        if (id != null) {
            return super.getProductsByCategoryId(id);
        }
        return super.getAll();
    }

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
