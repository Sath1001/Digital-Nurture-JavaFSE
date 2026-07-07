package com.cognizant.springtesting;

import com.cognizant.springtesting.entity.User;
import com.cognizant.springtesting.repository.UserRepository;
import com.cognizant.springtesting.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void testGetUserById() {

        User user = new User(1L, "John");

        when(repository.findById(1L)).thenReturn(Optional.of(user));

        assertEquals("John", service.getUserById(1L).getName());

    }

}