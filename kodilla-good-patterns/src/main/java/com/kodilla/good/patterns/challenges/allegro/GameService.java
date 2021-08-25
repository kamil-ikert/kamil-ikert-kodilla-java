package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class GameService implements SaleService {

    @Override
    public boolean sold(User user, Product product, LocalDate localDate) {
        System.out.println("The user: " + user + " bought game: " + product + ". Day of purchase: " + localDate);
        return true;
    }
}
