package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String nameOfContinent;
    private List<Country> listOfCountries = new ArrayList<>();

    public Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountries);
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public boolean addCountry (Country country){
       return listOfCountries.add(country);
    }
}
