package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public interface SaleService {

    boolean sold (User user, Product product, LocalDate localDate);
}
