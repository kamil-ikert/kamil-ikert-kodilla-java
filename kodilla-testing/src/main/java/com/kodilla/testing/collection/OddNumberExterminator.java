package com.kodilla.testing.collection;
import java.util.*;

public class OddNumberExterminator {

    public List<Integer> exterminate (List<Integer> numbers) {
        List<Integer> evenNumberList = new LinkedList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumberList.add(number);
            }
        }
        System.out.println("Even list size: " + evenNumberList.size());
        return evenNumberList;
    }
}