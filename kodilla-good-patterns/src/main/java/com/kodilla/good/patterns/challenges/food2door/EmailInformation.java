package com.kodilla.good.patterns.challenges.food2door;

public class EmailInformation implements InformationService {

    @Override
    public void inform(Order order, boolean isOrdered) {
        if(isOrdered){
            System.out.println("On behalf of our producers, we'd like to thank you for your order!");
            System.out.println("Information about order: /n " +
                    "Name: " + order.getClient().getName() + order.getClient().getSurname() +
                    "/n Address: " + order.getClient().getAddress() +
                    "/n Ordered Products(price): " + order.getProduct() + "(" + order.getAmountTaken() + ")" +
                    "/n Date: " + order.getDate() +
                    "/n Except delivery tomorrow morning!" +
                    "/n Thank You !");
        } else {
            System.out.println("Hi " + order.getClient().getName() + "!");
            System.out.println("We are sorry to say but we couldn't finish your order :(");
            System.out.println("Try again later.");
        }
    }
}
