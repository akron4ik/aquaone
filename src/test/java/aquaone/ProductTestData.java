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

    public static final Product PRODUCT1 = new Product(PRODUCT_1_ID, 1,  "Вода 19 литров", "Природная вода", 300, "/img/kash19.jpg");
    public static final Product PRODUCT2 = new Product(PRODUCT_2_ID, 1,  "Вода 5 литра", "Минеральная вода", 150, "/img/kash19.jpg");
    public static final Product PRODUCT3 = new Product(PRODUCT_3_ID, 1,  "Вода 1.5 литра", "Газированная вода", 90, "/img/kash19.jpg");
    public static final Product PRODUCT4 = new Product(PRODUCT_4_ID, 1,  "Вода 1.5 литра", "Минеральная вода", 80, "/img/kash19.jpg");
    public static final Product PRODUCT5 = new Product(PRODUCT_5_ID, 1, "Вода 0.5 литра", "Газированная вода", 50, "/img/kash19.jpg");
    public static final Product PRODUCT6 = new Product(PRODUCT_5_ID + 1, 1, "Вода 0.5 литра", "Минеральная вода", 40, "/img/kash19.jpg");
    public static final Product PRODUCT7 = new Product(PRODUCT_5_ID + 2, 2, "Стаканчики", "Пластиковые", 200, "/img/kash19.jpg");
    public static final Product PRODUCT8 = new Product(PRODUCT_5_ID + 3, 2, "Вилки", "Пластиковые", 150, "/img/kash19.jpg");
    public static final Product PRODUCT9 = new Product(PRODUCT_5_ID + 4, 2, "Тарелки", "Пластиковые", 250, "/img/kash19.jpg");
    public static final Product PRODUCT10 = new Product(PRODUCT_5_ID + 5, 2, "Ложки", "Для кофе", 150, "/img/kash19.jpg");
    public static final Product PRODUCT11 = new Product(PRODUCT_5_ID + 6, 3, "Кулер для воды LC-AEL-301bd", "Кулер с большим холодильником на 50л и дисплеем", 38050, "/img/kash19.jpg");
    public static final Product PRODUCT12 = new Product(PRODUCT_5_ID + 7, 3, "Кулер для воды LC-AEL-180c LCD", "Оснащен 16-ти литровым шкафчиком и монитором", 12100, "/img/kash19.jpg");
    public static final Product PRODUCT13 = new Product(PRODUCT_5_ID + 8, 3, "Кулер для воды LC-AEL-812a", "Кулер для воды с нижней загрузкой бутыли", 36750, "/img/kash19.jpg");

    public static final List<Product> PRODUCTS = List.of(PRODUCT1, PRODUCT2, PRODUCT3, PRODUCT4, PRODUCT5, PRODUCT6, PRODUCT7, PRODUCT8, PRODUCT9, PRODUCT10, PRODUCT11, PRODUCT12, PRODUCT13);

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
    /*public static ResultMatcher contentJson(L expected) {
        return result -> assertMatch(TestUtil.readListFromJsonMvcResult(result, Product.class), List.of(expected));
    }*/

    public static ResultMatcher contentJson(Product expected) {
        return result -> assertMatch(TestUtil.readFromJsonMvcResult(result, Product.class), expected);
    }

}
