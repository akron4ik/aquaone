package aquaone.web.user;

import aquaone.web.AbstractControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pro.aquaone.model.Role;
import pro.aquaone.model.User;

import static aquaone.TestUtil.readFromJson;
import static aquaone.TestUtil.userHttpBasic;
import static aquaone.UserTestData.*;
import static aquaone.CartTestData.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class AdminControllerTest extends AbstractControllerTest {
    private static final String URL = "/rest/admin";


    @Test
    void getAll() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(URL+"/users").contentType(MediaType.APPLICATION_JSON)
                .with(userHttpBasic(ADMIN)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(contentJson(ADMIN, USER, USER2));

    }

    @Test
    void get() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get(URL+"/100000").contentType(MediaType.APPLICATION_JSON)
                .with(userHttpBasic(ADMIN)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(contentJson(USER));

    }

    @Test
    void getAllCarts() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get(URL+"/carts").contentType(MediaType.APPLICATION_JSON)
                .with(userHttpBasic(ADMIN)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(contentJson(CART1, CART5,  CART2, CART3, CART4, CART6));
    }

    @Test
    void delete() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete(URL + "/"+ USER2_ID)
                .with(userHttpBasic(ADMIN)))
                .andExpect(status().isNoContent());
        assertMatch(userService.getAll(),  ADMIN, USER);

    }

    @Test
    void createOrUpdate() throws Exception {
        User created = new User(null, "New","New", "", "new@gmail.com", "nwePass",
                "90123453", "aaaaaa mmmmm", Role.ROLE_USER);

        ResultActions action = mockMvc.perform(MockMvcRequestBuilders.post(URL + "/")
                .contentType(MediaType.APPLICATION_JSON)
                .with(userHttpBasic(ADMIN))
                .content(jsonWithPassword(created, "newPass")))
                .andExpect(status().isCreated()).andDo(print());

        User returned = readFromJson(action, User.class);
        created.setId(returned.getId());

        assertMatch(returned, created);
        assertMatch(userService.getAll(), ADMIN, created, USER, USER2);
    }

    @Test
    void enable() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.patch(URL + "/" + USER_ID).param("enabled", "false")
                .contentType(MediaType.APPLICATION_JSON)
                .with(userHttpBasic(ADMIN)))
                .andDo(print())
                .andExpect(status().isNoContent());

        assertFalse(userService.get(USER_ID).isEnabled());
    }
}