package com.ndiamanti.rpncalculator;

import java.util.Stack;

public class Operand<T> implements Element<T> {

    private final T value;

    public Operand(T value) {
        this.value = value;
    }

    @Override
    public void process(Stack<T> stack) {
        stack.push(value);
    }
}
