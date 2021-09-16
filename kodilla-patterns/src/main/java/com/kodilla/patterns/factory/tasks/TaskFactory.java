package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String DRIVING = "DRIVINGTASK";
    public final static String SHOPPING = "SHOPPINGTASK";
    public final static String PAINTING = "PAINTNGTASK";


    public final Task generateTask(final String newTask) {

        switch (newTask) {
            case DRIVING:
                return new DrivingTask("Wyjazd", "Kraków", "AUDI A6");
            case SHOPPING:
                return new ShoppingTask("Zakupy spożywcze", "mleko", 2.5);
            case PAINTING:
                return new PaintingTask("Malowanie", "niebieski", "sciany sypialni");
            default:
                throw null;
        }
    }
}
