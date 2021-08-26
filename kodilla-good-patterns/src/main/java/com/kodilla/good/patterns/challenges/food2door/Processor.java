package com.kodilla.good.patterns.challenges.food2door;

public class Processor {

    private InformationService informationService;
    private ProducerService producerService;

    public Processor(InformationService informationService, ProducerService producerService) {
        this.informationService = informationService;
        this.producerService = producerService;
    }

    public void process(Order order) {
        boolean isSold = producerService.

    }
}
