package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class CreateNewSale implements SaleRepository {

    @Override
    public void createSaleRepository(User user, Product product, LocalDate localDate) {
        System.out.println("Saving purchase to database");
        System.out.println("User: " + user);
        System.out.println("Product(price): " + product.getName()+"("+product.getPrice()+")");
        System.out.println("Date: " + localDate);
    }
}
