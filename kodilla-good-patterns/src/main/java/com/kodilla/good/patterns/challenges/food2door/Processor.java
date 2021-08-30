package com.kodilla.good.patterns.challenges.food2door;

public class Processor {

    private InformationService informationService;
    private RegisteredProducers registeredProducers;

    public Processor(InformationService informationService, RegisteredProducers registeredProducers) {
        this.informationService = informationService;
        this.registeredProducers = registeredProducers;
    }

    public ProducerService getProducerOfProduct(Product product) {
        return registeredProducers.getProducerOfSpecificProduct(product);
    }

    public void process(Order order) {
        registeredProducers.showAllAvailableProducts();
        boolean isAvailable = registeredProducers.isAvailableProduct(order.getProduct(), order.getAmountTaken());
        getProducerOfProduct(order.getProduct()).process(order.getProduct(), order.getAmountTaken());
        informationService.inform(order, isAvailable);
    }
}
