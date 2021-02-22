package com.ndiamanti.rpncalculator;

import java.util.Stack;

public interface Element<T> {

    void process(Stack<T> stack);
}
