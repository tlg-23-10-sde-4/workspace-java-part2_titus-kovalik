/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    // fixture: this is the business object(s) under test
    private Calculator calc;

    @BeforeClass
    public static void initializeTestRun() {
        System.out.println("initializeTestRun");
    }

    @AfterClass
    public static void finalizeTestRun() {
        System.out.println("finalizeTestRun");
    }

    @Before
    public void setUp() {
        System.out.println("setUp");
        calc = new Calculator();
    }
    @After
    public void tearDown() {
        System.out.println("tearDown");
        //generally for closing files or databases that where opened by the setUp @Before
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(1, 4));  // expected, actual
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calc.divide(4,2), .001);
    }

    @Test
    public void testIsEquals() {
        assertTrue(calc.isEven(10));
        assertFalse(calc.isEven(11));
    }

}