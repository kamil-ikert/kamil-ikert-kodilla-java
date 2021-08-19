package com.kodilla.exception.test;

public class MainFlight {

    public static void main(String[] args) {
        Flight flight = new Flight("Cracow","Poznan");
        Flight flight1 = new Flight("Warsaw","Rome");
        FlightSearch flightSearch = new FlightSearch();

        try{
            flightSearch.findFlight(flight);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }

        try{
            flightSearch.findFlight(flight1);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
