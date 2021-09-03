package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculator() {
        //Given
        //When
        calculator.mul(2, 2);
        calculator.add(100, 50);
        calculator.div(100, 20);
        calculator.sub(55, 5);
        //Then
    }
}
