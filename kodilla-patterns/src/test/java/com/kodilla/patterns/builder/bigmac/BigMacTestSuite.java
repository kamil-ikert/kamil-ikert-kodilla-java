package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BigMacTestSuite {

    @Test
    void testNewBigMac() {

        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Pełnoziarnista")
                .ingredient("Cebula")
                .burgers(2)
                .sauce("1000 wysp")
                .ingredient("Pieczarki")
                .ingredient("Bekon")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);

    }
}
