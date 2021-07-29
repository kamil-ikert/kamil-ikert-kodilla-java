package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public class Country {
    public String countryName;
    public BigDecimal amountOfPeople;

    public Country(String countryName, BigDecimal amountOfPeople) {
        this.countryName = countryName;
        this.amountOfPeople = amountOfPeople;
    }

    public BigDecimal getPeopleQuantity() {
        return amountOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryName);
    }
}
