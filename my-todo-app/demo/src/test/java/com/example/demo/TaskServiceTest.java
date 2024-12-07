package com.example.demo;

import com.example.demo.TaskService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    void testGetAllTasks() {
        List<String> tasks = taskService.getAllTasks();
        assertThat(tasks).isNotNull();
        assertThat(tasks).hasSize(3);
        assertThat(tasks).contains("Task 1: Learn Spring Boot", "Task 2: Create a REST API");
    }

    @Test
    void testAddTask() {
        List<String> tasks = taskService.getAllTasks();
        taskService.addTask(tasks, "Task 4: Test add functionality");
        assertThat(tasks).contains("Task 4: Test add functionality");
    }

    @Test
    void testGetTaskByIndex() {
        List<String> tasks = taskService.getAllTasks();
        String task = taskService.getTaskByIndex(tasks, 1);
        assertThat(task).isEqualTo("Task 2: Create a REST API");
    }
}
