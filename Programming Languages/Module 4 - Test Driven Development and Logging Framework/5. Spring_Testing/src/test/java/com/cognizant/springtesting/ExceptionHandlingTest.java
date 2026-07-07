package com.cognizant.springtesting;

import com.cognizant.springtesting.repository.UserRepository;
import com.cognizant.springtesting.service.UserService;
import java.util.NoSuchElementException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExceptionHandlingTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void testUserNotFound() {

        when(repository.findById(100L))
                .thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class,
                () -> service.getUserById(100L));
    }
}