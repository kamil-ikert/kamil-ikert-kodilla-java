package com.kodilla.good.patterns.challenges.food2door;

import java.util.Objects;

public class Producer implements ProducerService {
    private String name;
    private String address;

    public Producer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void process(Product product, int quantity) {
        System.out.println("Message form producer:");
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return name.equals(producer.name) && address.equals(producer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
