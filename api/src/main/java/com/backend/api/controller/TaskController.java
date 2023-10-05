package com.backend.api.controller;

import com.backend.api.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public void setTaskService (TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping(value = "/api/tasks")

    @GetMapping(value = "/api/users")

    @GetMapping(value = "/api/users/{id}")

    @PutMapping(value = "/api/users/{id}")


}
