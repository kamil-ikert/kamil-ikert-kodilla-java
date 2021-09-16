package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testMakeShoppingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.generateTask(TaskFactory.SHOPPING);
        boolean beforeExecution = shopping.isTaskExecuted();
        shopping.executeTask();

        //Then
        Assert.assertEquals("Zakupy spożywcze", shopping.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testMakePaintingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.generateTask(TaskFactory.PAINTING);
        boolean beforeExecution = painting.isTaskExecuted();
        painting.executeTask();

        //Then
        Assert.assertEquals("Malowanie", painting.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testMakeDrivingTask() {

        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.generateTask(TaskFactory.DRIVING);
        boolean beforeExecution = driving.isTaskExecuted();
        driving.executeTask();

        //Then
        Assert.assertEquals("Wyjazd", driving.getTaskName());
        Assert.assertFalse(beforeExecution);
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
