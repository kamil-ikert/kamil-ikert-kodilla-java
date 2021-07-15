package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double checkAverage() {
        ArrayList<Double> exampleList = new ArrayList<>();
        double result = 0;
        for (Map.Entry<String, Double> numbers: temperatures.getTemperatures().entrySet()){
             exampleList.add(numbers.getValue());
             result =+ numbers.getValue();
        }
        return result/exampleList.size();
    }

    public double checkMedian() {
        ArrayList<Double> exampleList = new ArrayList<>();
        double result = 0;
        for (Map.Entry<String, Double> median: temperatures.getTemperatures().entrySet()) {
            exampleList.add(median.getValue());
        }
            Collections.sort(exampleList);
            int n = exampleList.size();
            if (n % 2 == 0) {
                result = (exampleList.get(n/2) + exampleList.get(n/2 + 1)) / 2;
            }
            else {
                result = exampleList.get((n+1)/2);
            }
        return result;
    }
}
