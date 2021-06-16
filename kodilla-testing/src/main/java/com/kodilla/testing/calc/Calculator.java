package com.kodilla.testing.calc;

public class Calculator {
    private int a;
    private int b;

    public int addAtoB(int a, int b) {
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return b - a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}