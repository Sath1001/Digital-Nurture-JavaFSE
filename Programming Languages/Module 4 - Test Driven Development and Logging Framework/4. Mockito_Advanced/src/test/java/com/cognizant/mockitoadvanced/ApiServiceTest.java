package com.cognizant.mockitoadvanced;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testRestClientMock() {

        RestClient client = mock(RestClient.class);

        when(client.fetchResponse()).thenReturn("Success");

        ApiService apiService = new ApiService(client);

        assertEquals("Success", apiService.getApiResponse());

        verify(client).fetchResponse();

    }

}