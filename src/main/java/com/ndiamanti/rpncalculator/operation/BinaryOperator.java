package com.ndiamanti.rpncalculator.operation;

import com.ndiamanti.rpncalculator.Element;

import java.util.Stack;

public abstract class BinaryOperator<T> implements Element<T> {

    @Override
    public void process(Stack<T> stack) {
        if (stack == null || stack.isEmpty())
            throw new EmptyStackException();

        T secondOperand = stack.pop();
        T firstOperand = stack.pop();
        stack.push(evaluate(firstOperand, secondOperand));
    }

    protected abstract T evaluate(T firstOperand, T secondOperand);

    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("Element stack is empty");
        }
    }
}
