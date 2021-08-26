package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class RegisteredProducers {

    Map<ProducerService, RegisteredProduct> registeredProducers = new HashMap<>();

    public void addNewProducer(ProducerService producer,RegisteredProduct registeredProduct) {
        registeredProducers.put(producer, registeredProduct);
    }
}
