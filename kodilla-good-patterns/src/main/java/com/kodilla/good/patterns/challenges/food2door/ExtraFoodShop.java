package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements ProducerService {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ExtraFoodShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public void process(Product product, int quantity) {
        System.out.println("Product: " + product.getName() + " is ready for delivery.");
        System.out.println("Prepared quantity: " + quantity);
    }
}
