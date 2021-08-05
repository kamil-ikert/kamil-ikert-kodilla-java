package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] given = {1,2,3,4,5,6,7,8,9,10};
        double expected = 5.5;
        //When
        double average = ArrayOperations.getAverage(given);
        System.out.println("Average: " + average);
        //Then
        Assert.assertEquals(average, expected, 0.0001);
    }
}
