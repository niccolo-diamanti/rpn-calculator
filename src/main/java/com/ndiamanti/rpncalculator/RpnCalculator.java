package com.ndiamanti.rpncalculator;

import java.util.Stack;

public abstract class RpnCalculator<T> {


    public T calculateExpression(String expression) {
        if (expression.contains("|")) {
            expression = substituteVariables(expression);
        }

        Stack<T> values = new Stack<>();
        String[] splittedExpression = expression.split(" ");

        for (String element : splittedExpression) {
            parseElement(element).process(values);
        }

        return values.pop();
    }

    protected abstract Element<T> parseElement(String element);

    protected abstract void accept(Visitor<T> visitor);

    protected String substituteVariables(String expression) {
        String[] split = expression.split("\\|");
        String variablesDefinition = split[1].trim();
        expression = split[0].trim();
        String[] splittedExpression = variablesDefinition.split(" ");
        for (int i = 0; i < splittedExpression.length; i++) {
            if (i % 2 == 0)
                expression = expression.replaceAll(splittedExpression[i], splittedExpression[i + 1]);
        }
        return expression;
    }
}
