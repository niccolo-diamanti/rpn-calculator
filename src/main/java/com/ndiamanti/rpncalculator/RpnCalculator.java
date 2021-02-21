package com.ndiamanti.rpncalculator;

import java.util.Stack;

public class RpnCalculator {

    public Integer calculateExpression(String expression) {
        Stack<Integer> values = new Stack<>();
        String[] splittedExpression = expression.split(" ");

        for (String currentString : splittedExpression) {
            if (isInteger(currentString))
                values.push(Integer.valueOf(currentString));
            else
                values.push(executeOperation(currentString, values));
        }
        return values.pop();
    }

    private boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }

    private Integer executeOperation(String operation, Stack<Integer> values) {
        if (operation.equals("+")) {
            Integer secondOperand = values.pop();
            Integer firstOperand = values.pop();
            return firstOperand + secondOperand;
        } else if (operation.equals("-")) {
            Integer secondOperand = values.pop();
            Integer firstOperand = values.pop();
            return firstOperand - secondOperand;
        } else if (operation.equals("x")) {
            Integer secondOperand = values.pop();
            Integer firstOperand = values.pop();
            return firstOperand * secondOperand;
        } else if (operation.equals("/")) {
            Integer secondOperand = values.pop();
            Integer firstOperand = values.pop();
            return firstOperand / secondOperand;
        } else return 0;
    }
}
