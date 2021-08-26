package com.kodilla.good.patterns.challenges.food2door;

public class Client {
    private final String name;
    private final String surname;
    private final String address;

    public Client(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
