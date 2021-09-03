package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When
        Board board = (Board)context.getBean("getBoard");

        ArrayList<String> taskToDoList = (ArrayList)board.getToDoList().getTaskList();
        taskToDoList.add("Added the first task.");

        ArrayList<String> taskInProgressList = (ArrayList)board.getInProgressList().getTaskList();
        taskInProgressList.add("The second task is in progress.");

        ArrayList<String> taskDoneList = (ArrayList)board.getDoneList().getTaskList();
        taskDoneList.add("The third task is done.");

        //Then
        assertEquals("Added the first task.", taskToDoList.get(0));
        assertEquals("The second task is in progress.", taskInProgressList.get(0));
        assertEquals("The third task is done.", taskDoneList.get(0));
    }
}
