package aquaone.web.cart;

import aquaone.web.AbstractControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pro.aquaone.model.Cart;

import static aquaone.CartTestData.*;
import static aquaone.TestUtil.readListFromJsonMvcResult;
import static aquaone.TestUtil.userHttpBasic;
import static aquaone.UserTestData.USER;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class CartControllerTest extends AbstractControllerTest {
    private static final String URL = "/rest/cart/";

    @Test
    void get() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "100008")
                .with(userHttpBasic(USER)))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(result -> assertMatch(readListFromJsonMvcResult(result, Cart.class), CART1));
    }

    @Test
    void delete() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .delete(URL + "100008")
                .with(userHttpBasic(USER)))
                .andExpect(status().isNoContent());
        assertMatch(cartService.getAll(), CART6, CART4, CART3, CART2,  CART5);
    }

   /* @Test
    void getUnauth() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(URL + "100010")).andDo(print())
                .andExpect(status().isUnauthorized());
    }

    @Test
    void getNotFound() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(URL + 100010)
                .with(userHttpBasic(USER)))
                .andExpect(status().isUnprocessableEntity());
    }*/

    @Test
    void createWithLocation() {
    }

    @Test
    void update() {
    }

    @Test
    void getBetween() {
    }
}