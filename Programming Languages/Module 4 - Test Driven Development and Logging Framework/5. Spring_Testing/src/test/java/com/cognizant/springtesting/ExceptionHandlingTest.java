package com.cognizant.springtesting;

import com.cognizant.springtesting.service.UserService;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ExceptionHandlingTest {

    @Test
    void testUserNotFound() {

        UserService service = new UserService();

        assertThrows(NoSuchElementException.class,
                () -> service.getUserById(100L));

    }

}