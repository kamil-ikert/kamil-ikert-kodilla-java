package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<>();
    boolean addFigure(Shape shape){
        boolean result = true;
        if(figures.contains(shape)) {
            result = false;
        }
        else {
            figures.add(shape);
        }
        return result;
    }

    boolean removeFigure(Shape shape){
        boolean result = false;
        if(figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
    return result;
    }

    Shape getFigure(int n) {
        Shape takenFigure = null;
    if (n >=0 && n<figures.size()) {
        takenFigure = figures.get(n);
    }
        return takenFigure;
    }

    String showFigures() {
    String result = "";
    for (Shape take: figures) {
        result += take.getShapeName();
    }
    return result;
    }
}
