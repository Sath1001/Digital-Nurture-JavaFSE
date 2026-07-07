package com.cognizant.springtesting;

import com.cognizant.springtesting.repository.UserRepository;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class RepositoryQueryTest {

    @Test
    void testFindByName() {

        UserRepository repository = Mockito.mock(UserRepository.class);

        when(repository.findByName("John"))
                .thenReturn(Collections.emptyList());

        assertNotNull(repository.findByName("John"));

    }

}