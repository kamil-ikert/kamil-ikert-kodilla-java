package com.kodilla.testing;
import com.kodilla.testing.calc.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 90);

        int result = calculator.subtractAFromB();

        if (result == 80) {
            System.out.println("Subtract test is Ok!");
        } else {
            System.out.println("Subtract error!");
        }

        int result1 = calculator.addAtoB();

        if (result1 == 100) {
            System.out.println("Adding test is Ok!");
        } else {
            System.out.println("Adding error!");
        }
    }
}