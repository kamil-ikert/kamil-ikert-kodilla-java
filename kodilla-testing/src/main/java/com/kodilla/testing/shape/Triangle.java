package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private Double a;
    private Double h;

    public Triangle(Double a, Double h) {
        this.a = a;
        this.h = h;
    }

    public Double getA() {
        return a;
    }

    public Double getH() {
        return h;
    }

    public String getShapeName() {
    return "Triangle";
    }

    public Double getField() {
    return 1/2 * (a*h);
    }
}
