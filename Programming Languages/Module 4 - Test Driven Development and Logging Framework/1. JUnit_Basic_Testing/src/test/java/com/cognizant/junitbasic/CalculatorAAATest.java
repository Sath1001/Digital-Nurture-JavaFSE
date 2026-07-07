package com.cognizant.junitbasic;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculatorAAATest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Complete");
    }

    @After
    public void tearDown() {
        System.out.println("Cleanup Complete");
    }

    @Test
    public void testAddition() {

        int expected = 10;

        int actual = calculator.add(4, 6);

        assertEquals(expected, actual);

    }

}