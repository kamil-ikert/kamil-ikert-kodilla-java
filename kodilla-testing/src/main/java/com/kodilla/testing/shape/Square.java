package com.kodilla.testing.shape;

public class Square implements Shape{
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public String getShapeName() {
    return "Square";
    }

    public Double getField() {
    return 4*a;
    }
}
