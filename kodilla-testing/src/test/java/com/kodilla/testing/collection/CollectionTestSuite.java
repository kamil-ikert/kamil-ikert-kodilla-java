package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import static java.util.Arrays.asList;

public class CollectionTestSuite {
    @BeforeEach
    public void before(){
        System.out.println("Starting test of new condition");
    }
    @AfterEach
    public void after(){
        System.out.println("Test finished");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Starting Global test");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Global Test finished");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        List<Integer> numbers = Collections.emptyList();
        OddNumberExterminator test = new OddNumberExterminator();
        test.exterminate(numbers);

        List<Integer> evenList = test.exterminate(numbers);

        Assertions.assertTrue(evenList.isEmpty());
    }

    @Test
    public void testOddNumberExterminatorNormalList() {
        List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,10);
        OddNumberExterminator test = new OddNumberExterminator();
        test.exterminate(numbers);

        List<Integer> evenList = test.exterminate(numbers);
        List<Integer> checkList = new LinkedList<>();
        checkList.add(2);
        checkList.add(4);
        checkList.add(6);
        checkList.add(8);
        checkList.add(10);
        Assertions.assertEquals(evenList, checkList);
    }
}
