package aquaone;

import org.springframework.test.web.servlet.ResultMatcher;
import pro.aquaone.model.Product;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductTestData {
    public static final int PRODUCT_1_ID = 100003;
    public static final int PRODUCT_2_ID = 100004;
    public static final int PRODUCT_3_ID = 100005;
    public static final int PRODUCT_4_ID = 100006;
    public static final int PRODUCT_5_ID = 100007;

    public static final Product PRODUCT1 = new Product(PRODUCT_1_ID, "Вода 19 литров", "Природная вода", 300);
    public static final Product PRODUCT2 = new Product(PRODUCT_2_ID, "Вода 1.5 литра", "Минеральная вода", 150);
    public static final Product PRODUCT3 = new Product(PRODUCT_3_ID, "Вода 0.5 литра", "Газированная вода", 85);
    public static final Product PRODUCT4 = new Product(PRODUCT_4_ID, "Стаканчики", "Пластиковые", 15);
    public static final Product PRODUCT5 = new Product(PRODUCT_5_ID, "Ложечки", "Для кофе", 100);

    public static void assertMatch(Product actual, Product expected) {
        assertThat(actual)
                .isEqualToIgnoringGivenFields(expected);
    }

    public static void assertMatch(Iterable<Product> actual, Product... expected) {
        assertMatch(actual, List.of(expected));
    }

    public static void assertMatch(Iterable<Product> actual, Iterable<Product> expected) {
        assertThat(actual).isEqualTo(expected);
    }

    public static ResultMatcher contentJson(Product... expected) {
        return result -> assertMatch(TestUtil.readListFromJsonMvcResult(result, Product.class), List.of(expected));
    }

    public static ResultMatcher contentJson(Product expected) {
        return result -> assertMatch(TestUtil.readFromJsonMvcResult(result, Product.class), expected);
    }

}
