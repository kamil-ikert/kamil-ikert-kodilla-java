package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class RegisteredProduct {

    private List<Product> listOfProduct = new ArrayList<Product>();

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public Product getProductFromList(Product product) {
        return listOfProduct.get(listOfProduct.indexOf(product));
    }

    public boolean addNewProduct (Product product) {
        if (listOfProduct.contains(product)) {
            System.out.println("Product is already in the database!");
            return false;
        } else {
            listOfProduct.add(product);
            System.out.println("Product has been added!");
            return true;
        }
    }
}
