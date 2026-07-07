package com.cognizant.springtesting.service;

import com.cognizant.springtesting.entity.User;
import com.cognizant.springtesting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUserById(Long id) {

        return repository.findById(id)
                .orElseThrow(NoSuchElementException::new);

    }

    public User saveUser(User user) {

        return repository.save(user);

    }

}