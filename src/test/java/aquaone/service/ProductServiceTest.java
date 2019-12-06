package aquaone.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import pro.aquaone.model.Product;
import pro.aquaone.service.product.ProductService;

import static aquaone.ProductTestData.*;

public class ProductServiceTest extends AbstractServiceTest {

    @Autowired
    ProductService service;

    @Test
    void get() throws Exception {
        assertMatch(service.get(PRODUCT_1_ID), PRODUCT1);
    }

    @Test
    void create() throws Exception {
        Product newProduct = new Product(null, "Кулер", "Новый кулер", 6000);
        Product created = service.create(newProduct);
        assertMatch(created, newProduct);
        assertMatch(service.getAll(), PRODUCT1, PRODUCT2, PRODUCT3, PRODUCT4, PRODUCT5, created);
    }

    @Test
    void delete() throws Exception {
        service.delete(PRODUCT_1_ID);
        assertMatch(service.getAll(), PRODUCT2, PRODUCT3, PRODUCT4, PRODUCT5);
    }

    @Test
    void update() throws Exception {
        Product updated = new Product(PRODUCT1);
        updated.setName("Новый Кулер");
        updated.setDescription("Самый новый кулер");
        service.update(new Product(updated));
        assertMatch(service.get(PRODUCT_1_ID), updated);
    }

    @Test
    void getAll() throws Exception {
        assertMatch(service.getAll(), PRODUCT1, PRODUCT2, PRODUCT3, PRODUCT4, PRODUCT5);
    }
}
