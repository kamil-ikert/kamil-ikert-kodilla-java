package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public String getShapeName() {
    return "Circle";
    }

    public Double getField() {
    return 3.14*r;
    }
}
