package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String NAME = "List of tasks";
    private static final String DESCRIPTION = "Test: Making new list of tasks";
    @Autowired
    private TaskListDao taskListDao;


    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(NAME, DESCRIPTION);
        taskListDao.save(taskList);

        //When
        String name = taskList.getListName();
        List<TaskList> readName = taskListDao.findByListName(name);
        int size = readName.size();

        //Then
        assertEquals(NAME, taskList.getListName());
        assertEquals(1,size);

        //CleanUp
        int id = readName.get(0).getId();
        taskListDao.deleteById(id);
    }
}
