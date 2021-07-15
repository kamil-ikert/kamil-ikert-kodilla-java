package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Testing procedure has been started");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Testing procedure has been finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Phase #" + testCounter + " has started");
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("Done");
    }

    @Nested
    @DisplayName("Method's Test")

    class Test {

        @org.junit.jupiter.api.Test
        void testAddFigure() {
            //Given
            ShapeCollector obj = new ShapeCollector();
            Shape circle = new Circle(4.0);
            //When
            boolean result = obj.addFigure(circle);
            //Then
            assertTrue(result);
        }

        @org.junit.jupiter.api.Test
        void testRemoveFigure() {
            //Given
            ShapeCollector obj = new ShapeCollector();
            Shape circle = new Circle(4.0);
            obj.addFigure(circle);
            //When
            boolean result = obj.removeFigure(circle);
            //Then
            assertTrue(result);
        }

        @org.junit.jupiter.api.Test
        void testGetFigure() {
            //Given
            ShapeCollector obj = new ShapeCollector();
            Shape circle = new Circle(4.0);
            obj.addFigure(circle);
            //When
            Shape result = obj.getFigure(0);
            //Then
            assertEquals(result, circle);
        }

        @org.junit.jupiter.api.Test
        void testShowFigures() {
            //
            ShapeCollector obj = new ShapeCollector();
            Shape circle = new Circle(4.0);
            obj.addFigure(circle);
            String result = "Circle";
            //
            assertEquals(result, obj.showFigures());
        }
    }
}
