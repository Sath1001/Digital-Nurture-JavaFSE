package com.cognizant.junitadvanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionThrowerTest {

    private final ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test
    void testException() {

        assertThrows(
                IllegalArgumentException.class,
                () -> exceptionThrower.throwException()
        );

    }

}