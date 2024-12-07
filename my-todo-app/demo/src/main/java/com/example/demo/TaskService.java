package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class TaskService {

    // 方法：获取任务列表
    public List<String> getAllTasks() {
        List<String> tasks = new ArrayList<>();
        tasks.add("Task 1: Learn Spring Boot");
        tasks.add("Task 2: Create a REST API");
        tasks.add("Task 3: Write Unit Tests");
        return tasks;
    }

    // 方法：添加任务
    public void addTask(List<String> tasks, String task) {
        if (task != null && !task.isEmpty()) {
            tasks.add(task);
        }
    }

    // 方法：获取单个任务
    public String getTaskByIndex(List<String> tasks, int index) {
        if (index >= 0 && index < tasks.size()) {
            return tasks.get(index);
        }
        return null; // 或者抛出异常，根据需要选择
    }
}
