package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("I am going OLSZTYN CAR", driving.executeTask());
        assertEquals("HOME", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("I am painting RED WALLS", painting.executeTask());
        assertEquals("WALL", painting.getTaskName());
        assertEquals(true, painting.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("I am shopping BREAD 1.0", shopping.executeTask());
        assertEquals("FOOD", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }
}
