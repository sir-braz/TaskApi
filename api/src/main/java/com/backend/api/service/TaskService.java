package com.backend.api.service;

import com.backend.api.entity.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    Task updateTask(Task existingTask);

    boolean deleteTaskById(Long id);
}
