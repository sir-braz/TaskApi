package com.backend.api.controller;

import com.backend.api.entity.Task;
import com.backend.api.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public void setTaskService (TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping(value = "/api/tasks")
    public ResponseEntity<Task> createTask(){

    }

    @GetMapping(value = "/api/tasks")
    public ResponseEntity<List<Task>> listAllTask(@RequestBody Task task){

    }

    @GetMapping(value = "/api/tasks/{id}")
    public ResponseEntity<List<Task>> listTask(@PathVariable Long taskId){

    }

    @PutMapping(value = "/api/tasks/{id}")

    @DeleteMapping(value = "/api/tasks/{id}")


}
