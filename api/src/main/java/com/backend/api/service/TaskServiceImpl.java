package com.backend.api.service;

import com.backend.api.entity.Task;
import com.backend.api.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class TaskServiceImpl implements TaskService{

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository, TaskRepository taskRepository1){
        this.taskRepository = taskRepository1;
    }

    @Override
    public Task createTask(Task task) {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public Task getTaskById(Long id) {
        return null;
    }

    @Override
    public Task updateTask(Task existingTask) {
        return null;
    }

    @Override
    public boolean deleteTaskById(Long id) {
        return false;
    }
}
