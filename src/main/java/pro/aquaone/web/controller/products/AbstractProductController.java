package pro.aquaone.web.controller.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pro.aquaone.model.Category;
import pro.aquaone.model.Product;
import pro.aquaone.service.category.CategoryService;
import pro.aquaone.service.product.ProductService;

import java.util.List;

import static pro.aquaone.util.ValidationUtil.assureIdConsistent;
import static pro.aquaone.util.ValidationUtil.checkNew;

public class AbstractProductController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    ProductService service;

    @Autowired
    CategoryService categoryService;

    public Product get(int id) {
        log.info("get product with id {}", id);
        return service.get(id);
    }

    public void delete(int id) {
        log.info("delete product with id {}", id);
        service.delete(id);
    }

    public List<Product> getAll() {
        log.info("getAll");
       return service.getAll();
    }

    public Product create(Product product) {
        checkNew(product);
        log.info("create {} ", product);
        return service.create(product);
    }

    public void update(Product product, int id) {
        assureIdConsistent(product, id);
        log.info("update {}", product);
        service.update(product);
    }



}
