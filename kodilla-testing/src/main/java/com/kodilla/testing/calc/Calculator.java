package com.kodilla.testing.calc;

public class Calculator {
    private int a;
    private int b;

    public int addAtoB() {
        return a + b;
    }

    public int subtractAFromB() {
        return b - a;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}