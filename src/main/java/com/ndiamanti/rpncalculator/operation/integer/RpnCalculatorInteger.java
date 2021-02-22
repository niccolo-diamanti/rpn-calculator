package com.ndiamanti.rpncalculator.operation.integer;

import com.ndiamanti.rpncalculator.Element;
import com.ndiamanti.rpncalculator.Operand;
import com.ndiamanti.rpncalculator.RpnCalculator;
import com.ndiamanti.rpncalculator.Visitor;

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

    @Override
    protected void accept(Visitor<Integer> visitor) {
        visitor.visit(this);
    }
}
