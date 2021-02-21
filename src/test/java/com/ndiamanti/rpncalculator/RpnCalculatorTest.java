package com.ndiamanti.rpncalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RpnCalculatorTest {

    RpnCalculator rpnCalculator = new RpnCalculator();

    @Test
    void calculateExpression_shouldAddNumbers() {
        assertEquals(7, rpnCalculator.calculateExpression("3 4 +"));
    }

    @Test
    void calculateExpression_shouldSubtractNumbers() {
        assertEquals(-2, rpnCalculator.calculateExpression("3 5 -"));
    }

    @Test
    void calculateExpression_shouldAddAndSubtractNumbers() {
        assertEquals(0, rpnCalculator.calculateExpression("3 5 - 2 +"));
    }

    @Test
    void calculateExpression_shouldMultiplyNumbers() {
        assertEquals(12, rpnCalculator.calculateExpression("3 4 x"));
        assertEquals(2, rpnCalculator.calculateExpression("2 1 x"));
    }

    @Test
    void calculateExpression_shouldDivideNumbers() {
        assertEquals(3, rpnCalculator.calculateExpression("6 2 /"));
        assertEquals(2, rpnCalculator.calculateExpression("2 1 /"));
    }

    @Test
    void calculateExpression_shouldHandleMultipleOperators() {
        assertEquals(5, rpnCalculator.calculateExpression("6 2 / 2 +"));
        assertEquals(11, rpnCalculator.calculateExpression("3 4 x 1 -"));
    }

    @Test
    void calculateExpression_shouldHandleVariables() {
        assertEquals(5, rpnCalculator.calculateExpression("var1 var2 + | var1 3 var2 2"));
        assertEquals(40, rpnCalculator.calculateExpression("3 var + var x | var 5"));
    }
}