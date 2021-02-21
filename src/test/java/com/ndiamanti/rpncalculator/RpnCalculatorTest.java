package com.ndiamanti.rpncalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RpnCalculatorTest {

    @Test
    void calculateExpression_shouldAddNumbers() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertEquals(7, rpnCalculator.calculateExpression("3 4 +"));
    }

    @Test
    void calculateExpression_shouldSubtractNumbers() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertEquals(-2, rpnCalculator.calculateExpression("3 5 -"));
    }

    @Test
    void calculateExpression_shouldAddAndSubtractNumbers() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertEquals(0, rpnCalculator.calculateExpression("3 5 - 2 +"));
    }

    @Test
    void calculateExpression_shouldMultiplyNumbers() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertEquals(12, rpnCalculator.calculateExpression("3 4 *"));
        assertEquals(2, rpnCalculator.calculateExpression("2 1 *"));
    }

    @Test
    void calculateExpression_shouldDivideNumbers() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertEquals(3, rpnCalculator.calculateExpression("6 2 /"));
        assertEquals(2, rpnCalculator.calculateExpression("2 1 /"));
    }
}