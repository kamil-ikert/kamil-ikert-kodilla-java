package com.kodilla.good.patterns.challenges.airport;

public class FlightRetriever {

    public static FlightsSet retrieve() {

        Flight flight1 = new Flight("Paris", "London");
        Flight flight2 = new Flight("London", "Paris");
        Flight flight3 = new Flight("Rome", "London");
        Flight flight4 = new Flight("Paris", "Rome");
        Flight flight5 = new Flight("Madrid", "London");
        Flight flight6 = new Flight("Madrid", "Warsaw");
        Flight flight7 = new Flight("Madrid", "Amsterdam");
        Flight flight8 = new Flight("Amsterdam", "Kiev");
        Flight flight9 = new Flight("Amsterdam", "Warsaw");
        Flight flight10 = new Flight("Kiev", "Madrid");

        FlightsSet flightsSet = new FlightsSet();
        flightsSet.addFlight(flight1);
        flightsSet.addFlight(flight2);
        flightsSet.addFlight(flight3);
        flightsSet.addFlight(flight4);
        flightsSet.addFlight(flight5);
        flightsSet.addFlight(flight6);
        flightsSet.addFlight(flight7);
        flightsSet.addFlight(flight8);
        flightsSet.addFlight(flight9);
        flightsSet.addFlight(flight10);

        return flightsSet;
    }
}
