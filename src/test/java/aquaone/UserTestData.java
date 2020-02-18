package aquaone;

import org.springframework.test.web.servlet.ResultMatcher;
import pro.aquaone.model.Role;
import pro.aquaone.model.User;
import pro.aquaone.to.UserTo;
import pro.aquaone.web.json.JsonUtil;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static pro.aquaone.model.AbstractBaseEntity.START_SEQ;

public class UserTestData {
    public static final int USER_ID = START_SEQ;
    public static final int USER2_ID = START_SEQ + 2;
    public static final int ADMIN_ID = START_SEQ + 1;

    public static final User USER = new User(USER_ID, "User", "User", "", "user@yandex.ru",
            "password", "8(985)123-4567", "Moscow, Amurskay st, 48 - 52",
            Role.ROLE_USER);

    public static final User USER2 = new User(USER2_ID, "User2", "User2", "","user@mail.ru",
            "password", "8(985)123-0000", "Moscow, Amurskay st, 48 - 52",
            Role.ROLE_USER);

    public static final User ADMIN = new User(ADMIN_ID, "Admin", "Admin", "", "admin@gmail.com",
            "admin", "+7(916)123-7654", "Voronezh, Lenin street, 1, 22",
            Role.ROLE_ADMIN, Role.ROLE_USER);

    public static void assertMatch(User actual, User expected) {
        assertThat(actual)
                .isEqualToIgnoringGivenFields(expected, "registered", "orders", "password", "organization");
    }
    public static void assertMatch(UserTo actual, UserTo expected) {
        assertThat(actual)
                .isEqualToIgnoringGivenFields(expected,  "password");
    }



    public static void assertMatch(Iterable<User> actual, User... expected) {
        assertMatch(actual, List.of(expected));
    }

    public static void assertMatch(Iterable<User> actual, Iterable<User> expected) {
        assertThat(actual).usingElementComparatorIgnoringFields("registered", "orders", "password", "organization").isEqualTo(expected);
    }

    public static ResultMatcher contentJson(User... expected) {
        return result -> assertMatch(TestUtil.readListFromJsonMvcResult(result, User.class), List.of(expected));
    }

    public static ResultMatcher contentJson(User expected) {
        return result -> assertMatch(TestUtil.readFromJsonMvcResult(result, User.class), expected);
    }

    public static String jsonWithPassword(User user, String passw) {
        return JsonUtil.writeAdditionProps(user, "password", passw);
    }
    public static String jsonWithPassword(UserTo user, String passw) {
        return JsonUtil.writeAdditionProps(user, "password", passw);
    }
}
