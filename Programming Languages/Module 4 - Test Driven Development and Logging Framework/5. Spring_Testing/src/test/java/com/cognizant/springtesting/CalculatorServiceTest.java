package com.cognizant.springtesting;

import com.cognizant.springtesting.service.CalculatorService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(10, calculatorService.add(4, 6));
    }
}