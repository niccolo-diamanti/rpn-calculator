package com.ndiamanti.rpncalculator.operation.integer;

import com.ndiamanti.rpncalculator.operation.BinaryOperator;

public class SubtractInteger extends BinaryOperator<Integer> {

    @Override
    protected Integer evaluate(Integer firstOperand, Integer secondOperand) {
        return firstOperand - secondOperand;
    }
}
