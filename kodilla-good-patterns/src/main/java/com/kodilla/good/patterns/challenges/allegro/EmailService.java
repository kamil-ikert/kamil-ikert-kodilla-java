package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDate;

public class EmailService implements InformationService {

    @Override
    public void inform(User user, Product product, LocalDate localDate, boolean isSold) {
        if (isSold) {
            System.out.println("Thank you " + user + " for buying: " + product + " at: " + localDate);
        } else {
            System.out.println("Sorry but we can't finalise this purchase");
        }
    }
}
