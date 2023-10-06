package com.backend.api.controller;

import com.backend.api.entity.Task;
import com.backend.api.service.TaskService;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public void setTaskService (TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping(value = "/api/tasks")
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "/api/tasks")
    public ResponseEntity<List<Task>> listAllTask(@RequestBody Task task){
        try{
            return null;
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
