package com.cognizant.mockitoadvanced;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testRepositoryMock() {

        Repository repository = mock(Repository.class);

        when(repository.getData()).thenReturn("Repository Data");

        Service service = new Service(repository);

        assertEquals("Repository Data", service.fetchData());

        verify(repository).getData();

    }

}