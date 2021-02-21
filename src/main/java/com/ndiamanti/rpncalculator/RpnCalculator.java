package com.ndiamanti.rpncalculator;

import java.util.Stack;

public class RpnCalculator {

    public Integer calculateExpression(String expression) {
        Stack<Integer> values = new Stack<>();
        String[] splittedExpression = expression.split(" ");
        for (String str : splittedExpression) {
            if (isInteger(str))
                values.push(Integer.valueOf(str));
            else
                values.push(add(values));
        }
        return values.pop();
    }

    private boolean isInteger(String str) {
        return str.matches("-?\\d+");
    }

    private Integer add(Stack<Integer> values) {
        Integer result = 0;
        while (!values.isEmpty()) {
            result += values.pop();
        }
        return result;
    }
}
