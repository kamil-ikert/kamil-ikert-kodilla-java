package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class OrderReceiver {

    public Order receive() {
        User user = new User("ZapasowyPaweł", "Paweł", "13Pablito37@wp.pl");
        Product product = new Product("The Witcher", 199.99);
        Order order = new Order(user, product, LocalDate.of(2021, 06, 24));

        return order;
    }
}
