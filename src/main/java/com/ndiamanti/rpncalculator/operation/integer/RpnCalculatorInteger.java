package com.ndiamanti.rpncalculator.operation.integer;

import com.ndiamanti.rpncalculator.Element;
import com.ndiamanti.rpncalculator.Operand;
import com.ndiamanti.rpncalculator.RpnCalculator;

public class RpnCalculatorInteger extends RpnCalculator<Integer> {

    @Override
    protected Element<Integer> parseElement(String operator) {
        switch (operator) {
            case "+":
                return new AddInteger();
            case "-":
                return new SubtractInteger();
            case "x":
                return new MultiplyInteger();
            case "/":
                return new DivideInteger();
            default:
                return new Operand<>(Integer.decode(operator));
        }
    }
}
