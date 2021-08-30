package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class Order {
    private Client client;
    private Product product;
    private LocalDate date;
    private int amountTaken;

    public Order(Client client, Product product, LocalDate date, int amountTaken) {
        this.client = client;
        this.product = product;
        this.date = date;
        this.amountTaken = amountTaken;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmountTaken() {
        return amountTaken;
    }
}
