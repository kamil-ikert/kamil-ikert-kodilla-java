package com.kodilla.testing;
import com.kodilla.testing.calc.Calculator;
import com.kodilla.testing.collection.OddNumberExterminator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println();
        List<Integer> numbers = new LinkedList<>();
        for(int y=0; y < 100; y++) {
            numbers.add(y);
        }
        System.out.println("List is filled. It's size: " + numbers.size());
        System.out.println("Dividing process");
        OddNumberExterminator Odd = new OddNumberExterminator();
        Odd.exterminate(numbers);
        System.out.println();

        //
        //Calculator
        //

        Calculator calculator = new Calculator();

        int result = calculator.subtractAFromB(10, 90 );

        if (result == 80) {
            System.out.println("Subtract test is Ok!");
        } else {
            System.out.println("Subtract error!");
        }

        int result1 = calculator.addAtoB(10,90);

        if (result1 == 100) {
            System.out.println("Adding test is Ok!");
        } else {
            System.out.println("Adding error!");
        }
    }
}