package com.kodilla.good.patterns.challenges.airport;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    public void searchWithInterchange (String departure, String interchange, String arrival) {
        System.out.println("List of flights with interchange with departure from: " + departure
                + " to: " + arrival + " with interchange in: " + interchange);

        List<Flight> list = listOfFlights.stream()
                .filter(f -> f.getDeparture().equals(departure) && f.getArrival().equals(interchange))
                .collect(Collectors.toList());
        listOfFlights.stream()
                .filter(f -> f.getDeparture().equals(interchange) && f.getArrival().equals(arrival))
                .collect(Collectors.toCollection(() ->list));
        list.stream()
                .forEach(System.out::println);
    }
}
