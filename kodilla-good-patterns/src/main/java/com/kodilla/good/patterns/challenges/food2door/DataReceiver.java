package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;

public class DataReceiver {

    public void receive() {

        Producer extraFoodShop = new Producer("ExtraFoodShop", "Ul. Piotrkowska 44");
        Producer glutenFreeShop = new Producer("GlutenFreeShop","Ul. Kościelna 94");
        Producer healthyShop = new Producer("HealthyShop", "Ul. Majewska 195");

        Client client1 = new Client("Piotr","Kowalski","Ul. Kosynierów Gdyńskich 19");

        Product product1 = new Product("Kiełbasa swojska", 5.99, 50);
        Product product2 = new Product("Ser naturalny", 3.49, 23);
        Product product3 = new Product("Pierogi ruskie", 11.99, 42);
        Product product4 = new Product("Szynka z kurczaka", 5.49, 12);
        Product product5 = new Product("Kaszanka na grilla", 7.29, 32);
        Product product6 = new Product("Mleko łaciate", 3.79, 53);
        Product product7 = new Product("Jogurt naturalny", 3.30, 7);

        RegisteredProduct extraFoodList = new RegisteredProduct();
        RegisteredProduct glutenFreeList = new RegisteredProduct();
        RegisteredProduct healthyShopList = new RegisteredProduct();

        extraFoodList.addNewProduct(product1);
        extraFoodList.addNewProduct(product2);
        extraFoodList.addNewProduct(product3);

        glutenFreeList.addNewProduct(product4);
        glutenFreeList.addNewProduct(product5);

        healthyShopList.addNewProduct(product6);
        healthyShopList.addNewProduct(product7);

        RegisteredProducers registeredProducers = new RegisteredProducers();

        registeredProducers.addNewProducer(extraFoodShop, extraFoodList);
        registeredProducers.addNewProducer(glutenFreeShop, glutenFreeList);
        registeredProducers.addNewProducer(healthyShop, healthyShopList);

        Order order = new Order(client1,product4, LocalDate.of(2021,12,21), 6);






    }
}
