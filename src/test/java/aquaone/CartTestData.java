package aquaone;

import org.springframework.test.web.servlet.ResultMatcher;
import pro.aquaone.model.Cart;
import pro.aquaone.model.User;
import pro.aquaone.web.json.JsonUtil;

import java.time.LocalDateTime;
import java.util.List;

import static aquaone.UserTestData.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CartTestData {
    public static final int CART_1_ID = 100008;
    public static final int CART_2_ID = 100009;
    public static final int CART_3_ID = 100010;
    public static final int CART_4_ID = 100011;
    public static final int CART_5_ID = 100012;
    public static final int CART_6_ID = 100013;

    public static final Cart CART1 = new Cart(CART_1_ID, LocalDateTime.of(2019, 12, 1,  10, 30), USER, 3000);
    public static final Cart CART2 = new Cart(CART_2_ID, LocalDateTime.of(2019, 12, 2,  11, 30), USER, 5000);
    public static final Cart CART3 = new Cart(CART_3_ID, LocalDateTime.of(2019, 12, 3,  20, 30), ADMIN, 4400);
    public static final Cart CART4 = new Cart(CART_4_ID, LocalDateTime.of(2019, 12, 5,  21, 40), ADMIN, 1000);
    public static final Cart CART5 = new Cart(CART_5_ID, LocalDateTime.of(2019, 12, 1,  11, 40), USER2, 1800);
    public static final Cart CART6 = new Cart(CART_6_ID, LocalDateTime.of(2019, 12, 6,  16, 35), USER2, 1800);

    public static void assertMatch(Cart actual, Cart expected) {
        assertThat(actual)
                .isEqualToIgnoringGivenFields(expected, "user");
    }

    public static void assertMatch(Iterable<Cart> actual, Cart... expected) {
        assertMatch(actual, List.of(expected));
    }

    public static void assertMatch(Iterable<Cart> actual, Iterable<Cart> expected) {
        assertThat(actual).usingElementComparatorIgnoringFields("user").isEqualTo(expected);
    }

    public static ResultMatcher contentJson(Cart... expected) {
        return result -> assertMatch(TestUtil.readListFromJsonMvcResult(result, Cart.class), List.of(expected));
    }

    public static ResultMatcher contentJson(Cart expected) {
        return result -> assertMatch(TestUtil.readFromJsonMvcResult(result, Cart.class), expected);
    }



}
