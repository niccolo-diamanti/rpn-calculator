package com.ndiamanti.rpncalculator;

public interface Visitor<T> {

    void visit(RpnCalculator<T> rpnCalculator);
}
