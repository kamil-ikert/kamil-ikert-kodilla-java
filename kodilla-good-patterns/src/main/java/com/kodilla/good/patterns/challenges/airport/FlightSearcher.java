package com.kodilla.good.patterns.challenges.airport;

import java.util.Set;

public class FlightSearcher {

    private Set<Flight> listOfFlights;

    public FlightSearcher(Set<Flight> listOfFlights){
        this.listOfFlights = listOfFlights;
    }

    public void searchByDeparture(String departure) {
        listOfFlights.stream()
                .filter(f -> f.getDeparture().equals(departure))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByArrival(String arrival) {
        listOfFlights.stream()
                .filter(f -> f.getArrival().equals(arrival))
                .map(f -> f.toString())
                .forEach(System.out::println);
        System.out.println();
    }
}
