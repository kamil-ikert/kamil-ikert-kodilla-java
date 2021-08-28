package com.kodilla.good.patterns.challenges.airport;

public class Main {

    public static void main(String[] args) {

        FlightsSet flightsSet = FlightRetriever.retrieve();

        FlightSearcher flightSearcher = new FlightSearcher(flightsSet.getListOfFlights());
        flightSearcher.searchByArrival("Rome");
        flightSearcher.searchByDeparture("Kiev");
        flightSearcher.searchByArrival("London");
        flightSearcher.searchByDeparture("Madrid");
        flightSearcher.searchWithInterchange("Kiev", "Madrid", "London");
    }
}
