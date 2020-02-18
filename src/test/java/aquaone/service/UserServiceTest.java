package aquaone.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import pro.aquaone.model.Role;
import pro.aquaone.model.User;
import pro.aquaone.service.user.UserService;
import pro.aquaone.util.exception.UserNotFoundException;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static aquaone.UserTestData.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest extends AbstractServiceTest {

    @Autowired
    UserService service;

    @BeforeEach
    void setUp() throws Exception {
        cacheManager.getCache("users").clear();
        jpaUtil.clear2ndLevelHibernateCache();
    }

    @Test
    void create() throws Exception{
        User newUser = new User(null, "Created", "Created", "", "created@created.ru", "created",
                "8(985)123-4567", "Moscow, Amurskay st, 48 - 52 ",  Role.ROLE_USER);
        User created = service.create(newUser);
        newUser.setId(created.getId());
        assertMatch(newUser, created);
        assertMatch(service.getAll(), ADMIN, newUser, USER, USER2);

    }

    @Test
    void duplicateMailCreate() throws Exception {
        assertThrows(DataAccessException.class, () ->
                service.create(new User(null, "Duplicate", "Duplicate", "", "admin@gmail.com", "newPass",
                        true, new Date(), Collections.singletonList( Role.ROLE_USER),
                        "created@created.ru", "created")));
    }

    @Test
    void get() throws Exception{
        User user = service.get(USER_ID);
        assertMatch(user, USER);
    }

    @Test
    void delete() throws Exception{
        service.delete(USER_ID);
        assertMatch(service.getAll(), ADMIN, USER2);
    }

    @Test
    void getNotFound() throws Exception {
        assertThrows(UserNotFoundException.class, () ->
                service.get(1));
    }

    @Test
    void getByEmail() throws Exception {
        User user = service.getByEmail("admin@gmail.com");
        assertMatch(user, ADMIN);
    }

    @Test
    void getByPhone() throws Exception {
        User user = service.getByPhone("+7(916)123-7654");
        assertMatch(user, ADMIN);
    }

    @Test
    void getUsersByAddress() throws Exception {
        List<User> users = service.getUsersByAddress("Moscow, Amurskay st, 48 - 52");
        assertMatch(users, USER, USER2);
    }



    @Test
    void update() throws Exception {
        User updated = new User(USER);
        updated.setName("UpdatedName");
        updated.setEmail("update@update.ru");
        service.update(new User(updated));
        assertMatch(service.get(USER_ID), updated);
    }

    @Test
    void enable() {
        service.enable(USER.getId(), false);
        assertFalse(service.get(USER.getId()).isEnabled());
        service.enable(USER.getId(), true);
        assertTrue(service.get(USER.getId()).isEnabled());
    }

    @Test
    void getAll(){
        List<User> actual = service.getAll();
        assertMatch(actual, ADMIN, USER, USER2);
    }
}
