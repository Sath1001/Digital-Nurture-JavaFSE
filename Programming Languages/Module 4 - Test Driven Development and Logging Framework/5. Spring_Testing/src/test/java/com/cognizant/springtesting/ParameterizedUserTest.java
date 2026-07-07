package com.cognizant.springtesting;

import com.cognizant.springtesting.service.CalculatorService;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedUserTest {

    private final CalculatorService calculatorService =
            new CalculatorService();

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "5,5,10",
            "10,20,30"
    })
    void testAdd(int a, int b, int result) {

        assertEquals(result,
                calculatorService.add(a, b));

    }

}