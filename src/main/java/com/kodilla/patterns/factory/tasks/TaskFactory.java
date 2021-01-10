package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVING";
    public static final String PAINTINGTASK = "PAINTING";
    public static final String SHOPPINGTASK = "SHOPPING";


    public final Task makeTask(final String shapeClass) {
        switch (shapeClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("FOOD", "BREAD", 1);
            case DRIVINGTASK:
                return new DrivingTask("HOME", "OLSZTYN", "CAR");
            case PAINTINGTASK:
                return new PaintingTask("WALL", "RED", "WALLS");
            default:
                return null;
        }
    }
}
