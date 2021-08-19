package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airport = new HashMap<>();
        airport.put("Warsaw", true);
        airport.put("Paris", true);
        airport.put("Cracow", true);
        airport.put("Rome", true);
        airport.put("Kiev", true);

        if(airport.containsKey(flight.getArrivalAirport())) {
            System.out.println("Arrival airport possible: " + flight.getArrivalAirport());
        }
        else
            throw new RouteNotFoundException("Airport doesn't exist!");

    }
}
