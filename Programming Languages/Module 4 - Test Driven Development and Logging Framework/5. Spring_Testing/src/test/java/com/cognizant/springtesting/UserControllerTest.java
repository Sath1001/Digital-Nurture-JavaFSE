package com.cognizant.springtesting;

import com.cognizant.springtesting.controller.UserController;
import com.cognizant.springtesting.entity.User;
import com.cognizant.springtesting.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    @Test
    void testController() {

        UserService service = Mockito.mock(UserService.class);

        User user = new User(1L, "John");

        Mockito.when(service.getUserById(1L)).thenReturn(user);

        UserController controller = new UserController();

        try {
            var field = UserController.class.getDeclaredField("service");
            field.setAccessible(true);
            field.set(controller, service);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        ResponseEntity<User> response = controller.getUser(1L);

        assertEquals("John", response.getBody().getName());

    }

}