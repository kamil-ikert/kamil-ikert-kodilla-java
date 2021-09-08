package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculator() {
        //Given
        //When
        double result1 = calculator.mul(2, 2);
        double result2 = calculator.add(100, 50);
        double result3 = calculator.div(100, 20);
        double result4 = calculator.sub(55, 5);
        //Then
        assertEquals(4, result1);
        assertEquals(150, result2);
        assertEquals(5, result3);
        assertEquals(50, result4);

    }
}
