package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        World world = new World();
        Continent europe = new Continent("Europa");
        Continent america = new Continent("America");
        Country poland = new Country("Poland",new BigDecimal("10000000001"));
        Country germany = new Country("Germany",new BigDecimal("10000000001"));
        Country spain = new Country("Spain",new BigDecimal("10000000001"));
        Country mexico = new Country("Mexico",new BigDecimal("10000000001"));
        Country usa = new Country("USA",new BigDecimal("10000000001"));
        Country canada = new Country("Canada",new BigDecimal("10000000001"));

        world.addContinent(europe);
        world.addContinent(america);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);

        america.addCountry(mexico);
        america.addCountry(usa);
        america.addCountry(canada);

        //When

        BigDecimal totalQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("60000000006");
        Assert.assertEquals(expected,totalQuantity);

    }
}
