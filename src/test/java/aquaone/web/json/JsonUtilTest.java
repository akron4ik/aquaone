package aquaone.web.json;

import aquaone.UserTestData;
import org.junit.jupiter.api.Test;
import pro.aquaone.model.Product;
import pro.aquaone.model.User;
import pro.aquaone.web.json.JsonUtil;


import java.util.List;

import static aquaone.ProductTestData.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


class JsonUtilTest {

    @Test
    void readWriteValue() throws Exception {
        String json = JsonUtil.writeValue(PRODUCT1);
        System.out.println(json);
        Product product = JsonUtil.readValue(json, Product.class);
        assertMatch(product, PRODUCT1);
    }

    @Test
    void readWriteValues() throws Exception {
        String json = JsonUtil.writeValue(PRODUCTS);
        System.out.println(json);
        List<Product> products = JsonUtil.readValues(json, Product.class);
        assertMatch(products, PRODUCTS);
    }

    @Test
    void writeOnlyAccess() throws Exception {
        String json = JsonUtil.writeValue(UserTestData.USER);
        System.out.println(json);
        assertThat(json, not(containsString("password")));
        String jsonWithPass = UserTestData.jsonWithPassword(UserTestData.USER, "newPass");
        System.out.println(jsonWithPass);
        User user = JsonUtil.readValue(jsonWithPass, User.class);
        assertEquals(user.getPassword(), "newPass");
    }
}