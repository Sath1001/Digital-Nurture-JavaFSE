package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testMocking() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mockito Success");

        MyService service = new MyService(api);

        assertEquals("Mockito Success", service.fetchData());

        verify(api).getData();

    }

    @Test
    void testMultipleCalls() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())
                .thenReturn("First")
                .thenReturn("Second");

        MyService service = new MyService(api);

        assertEquals("First", service.fetchData());
        assertEquals("Second", service.fetchData());

        verify(api, times(2)).getData();

    }

    @Test
    void testException() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData())
                .thenThrow(new RuntimeException("API Error"));

        MyService service = new MyService(api);

        org.junit.jupiter.api.Assertions.assertThrows(
                RuntimeException.class,
                service::fetchData
        );

    }

    @Test
    void testAnyMatcher() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Mock");

        MyService service = new MyService(api);

        service.fetchData();

        verify(api, atLeastOnce()).getData();

    }

}