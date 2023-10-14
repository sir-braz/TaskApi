package com.backend.api.service;

import com.backend.api.entity.Task;
import com.backend.api.repository.TaskRepository;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
        try{
            return taskRepository.save(task);
        }catch (BackendException ex){
            throw new BackendException("Error to create task");
        }
    }

    @Override
    public List<Task> getAllTasks() {
        try{
            return (List<Task>) taskRepository.findAll();
        }catch (BackendException ex){
            throw new BackendException("Error to list all tasks");
        }
    }

    @Override
    public Task getTaskById(Long id) {
        try{
            Optional<Task> taskOptional = taskRepository.findById(id);
            return taskOptional.orElse(null);
        }catch (BackendException ex){
            throw new BackendException("Error to get task with id");
        }
    }

    @Override
    public Task updateTask(Task existingTask) {
        try {
            // Check if the task with the provided ID exists in the repository
            Optional<Task> taskOptional = taskRepository.findById(existingTask.getId());

            if (taskOptional.isPresent()) {
                // The task exists, update its attributes based on 'existingTask'
                Task taskToUpdate = taskOptional.get();
                taskToUpdate.setTitle(existingTask.getTitle());
                taskToUpdate.setDescription(existingTask.getDescription());
                // Update other attributes...

                // Save the updated task in the repository
                return taskRepository.save(taskToUpdate);
            } else {
                // If the task does not exist, you can throw an exception or return null, depending on your error handling strategy.
                throw new BackendException("Task not found");
            }
        } catch (BackendException ex) {
            throw new BackendException("Error updating the task");
        }
    }

    @Override
    public boolean deleteTaskById(Long id) {
        try{
            return Boolean.parseBoolean(null);
        }catch (BackendException ex){
            throw new BackendException("Error to delet task with id");
        }
    }
}
