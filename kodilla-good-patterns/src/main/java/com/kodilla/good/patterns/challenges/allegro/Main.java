package com.kodilla.good.patterns.challenges.allegro;

public class Main {

    public static void main(String[] args) {
        OrderReceiver orderReceiver = new OrderReceiver();
        Order order = orderReceiver.receive();

        Processor processor = new Processor(new EmailService(),new GameService(), new CreateNewSale());
        processor.process(order);
    }
}
