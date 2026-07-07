package com.cognizant.springtesting;

import com.cognizant.springtesting.entity.User;
import com.cognizant.springtesting.service.UserService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CreateUserTest {

    @Test
    void testSaveUser() {

        UserService service = Mockito.mock(UserService.class);

        User user = new User(1L, "Alice");

        Mockito.when(service.saveUser(user)).thenReturn(user);

        assertEquals("Alice", service.saveUser(user).getName());

    }

}