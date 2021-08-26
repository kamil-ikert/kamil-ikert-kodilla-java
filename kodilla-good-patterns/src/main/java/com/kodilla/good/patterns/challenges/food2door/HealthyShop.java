package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements ProducerService {
    private String name;
    private String address;

    public HealthyShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void process(Product product, int quantity) {
        System.out.println("Product: " + product.getName() + " is ready for delivery.");
        System.out.println("Prepared quantity: " + quantity);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "HealthyShop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
