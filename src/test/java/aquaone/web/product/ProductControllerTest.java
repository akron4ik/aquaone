package aquaone.web.product;

import aquaone.web.AbstractControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static aquaone.ProductTestData.*;
import static aquaone.TestUtil.userHttpBasic;
import static aquaone.UserTestData.ADMIN;
import static aquaone.UserTestData.USER;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductControllerTest extends AbstractControllerTest {
<<<<<<< HEAD
    private static final String REST_URL = "/rest/products";
=======
    private static final String REST_URL = "/profile/products";
>>>>>>> 4fe8199bf73a2dde5a59078303f1fca4d9f22684

    @Test
    public void getAll() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(REST_URL).contentType(MediaType.APPLICATION_JSON)
                .with(userHttpBasic(USER)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(contentJson(PRODUCT1, PRODUCT2, PRODUCT3, PRODUCT4, PRODUCT5));
    }
}
