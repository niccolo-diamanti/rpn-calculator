package com.ndiamanti.rpncalculator;

public class RpnVisitorInteger implements Visitor<Integer> {

    @Override
    public void visit(RpnCalculator<Integer> rpnCalculator) {
        System.out.println("Visiting: ");
    }
}
