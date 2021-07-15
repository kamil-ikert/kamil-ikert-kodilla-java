package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    //
    //Preparations for testing
    //

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
    @DisplayName("Method's Tests")

    class Tests {
    @Test
    void testCalculateForecastWithMock() {

        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Lodz", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warsaw", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverage() {
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Lodz", 25.0);
        temperaturesMap.put("Krakow", 30.0);
        temperaturesMap.put("Wroclaw", 25.0);
        temperaturesMap.put("Warsaw", 15.0);
        temperaturesMap.put("Gdansk", 30.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.checkAverage();
        //Then
        Assertions.assertEquals(25.0, result);
    }

    @Test
    void testMedian() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Lodz", 5.0);
        temperaturesMap.put("Krakow", 2.0);
        temperaturesMap.put("Wroclaw", 3.0);
        temperaturesMap.put("Warsaw", 4.0);
        temperaturesMap.put("Gdansk", 1.0);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.checkMedian();
        //Then
        Assertions.assertEquals(3.0, result);
    }
    }
}
