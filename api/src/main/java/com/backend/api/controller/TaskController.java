package com.backend.api.controller;

import com.backend.api.entity.Task;
import com.backend.api.service.TaskService;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

//    public void setTaskService(TaskService taskService){
//        this.taskService = taskService;
//    }


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
    public ResponseEntity<List<Task>> listTask(@PathVariable Long id){
        try{
            Task task = taskService.getTaskById(id);

            if(task != null){
                return ResponseEntity.ok((List<Task>) task);
            }else{
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping(value = "/api/tasks/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task updateTask){
        try{
            Task existingTask = taskService.getTaskById(id);

            existingTask.setTitle(updateTask.getTitle());
            existingTask.setDescription(updateTask.getDescription());
            Task update = taskService.updateTask(existingTask);
            return ResponseEntity.ok(update);
        }catch (BackendException ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping("/api/tasks/{id}/complete")
    public ResponseEntity<Task> completeTask(@PathVariable Long id){
        try{
            Optional<Task> optionalTask = Optional.ofNullable(taskService.getTaskById(id));
            if(optionalTask.isPresent()){
                Task task = optionalTask.get();

                task.setCompleted(true);
                taskService.createTask(task);
            }else{
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.status(HttpStatus.CREATED).body(null);
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }



    @DeleteMapping(value = "/api/tasks/{id}")
    public ResponseEntity<Task> deleteTask(@PathVariable Long id){
        try{
            boolean deleted = taskService.deleteTaskById(id);

            if(deleted){
                return ResponseEntity.noContent().build();
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }


}
