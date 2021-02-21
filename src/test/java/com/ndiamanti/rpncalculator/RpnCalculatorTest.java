package com.ndiamanti.rpncalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RpnCalculatorTest {

    @Test
    void calculateExpression() {
        RpnCalculator rpnCalculator = new RpnCalculator();
        assertEquals(7, rpnCalculator.calculateExpression("3 4 +"));
    }
}