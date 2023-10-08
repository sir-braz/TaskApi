package com.backend.api.controller;

import com.backend.api.entity.Task;
import com.backend.api.service.TaskService;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @PostMapping(value = "/api/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        try{
            Task createdTask = taskService.createTask(task);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "/api/tasks")
    public ResponseEntity<List<Task>> listAllTask(){
        try{
            List<Task> tasks = taskService.getAllTasks();
            return ResponseEntity.status(HttpStatus.CREATED).body(tasks);
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "/api/tasks/{id}")
    public ResponseEntity<List<Task>> listTask(@PathVariable Long taskId){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping(value = "/api/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping(value = "/api/tasks/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable Long taskId){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}
