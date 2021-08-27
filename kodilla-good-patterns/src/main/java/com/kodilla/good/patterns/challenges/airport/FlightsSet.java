package com.kodilla.good.patterns.challenges.airport;

import java.util.HashSet;
import java.util.Set;

public class FlightsSet {
    private Set<Flight> listOfFlights = new HashSet<Flight>();

    public boolean addFlight(Flight flight) {
        listOfFlights.add(flight);
        return true;
    }

    public Set<Flight> getListOfFlights() {
        return listOfFlights;
    }
}
