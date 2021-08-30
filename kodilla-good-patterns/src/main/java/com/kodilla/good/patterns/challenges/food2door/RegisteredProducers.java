package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class RegisteredProducers {

    Map<ProducerService, RegisteredProduct> registeredProducers = new HashMap<>();

    public void addNewProducer(ProducerService producer,RegisteredProduct registeredProduct) {
        registeredProducers.put(producer, registeredProduct);
    }

    public void showAllAvailableProducts() {
        for (Map.Entry<ProducerService, RegisteredProduct> current : registeredProducers.entrySet()) {
            System.out.println(current.getKey());
            for (Product currentProduct : current.getValue().getListOfProduct()) {
                if (currentProduct.getQuantity() > 0)
                    System.out.println(currentProduct.toString());
            }
        }
    }

    public boolean isAvailableProduct(Product product, int volumeOfPurchase) {
        for (Map.Entry<ProducerService, RegisteredProduct> current : registeredProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProduct()) {
                if (currentProduct.equals(product) && currentProduct.getQuantity() > volumeOfPurchase) {
                    product.setQuantityAfterSale(volumeOfPurchase);
                    return true;
                }
            }
        }
        return false;
    }

    public ProducerService getProducerOfSpecificProduct(Product product) {
        for (Map.Entry<ProducerService, RegisteredProduct> current : registeredProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProduct()) {
                if (currentProduct.equals(product)) {
                    return current.getKey();
                }
            }
        }
        return null;
    }
}
