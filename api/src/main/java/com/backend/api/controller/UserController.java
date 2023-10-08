package com.backend.api.controller;

import com.backend.api.entity.User;
import com.backend.api.service.UserService;
import com.backend.api.utility.BackendException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/api/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        try{
            User createdUser = userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "/api/users")
    public ResponseEntity<List<User>> listAllUsers(){
        try{
            List<User> users = userService.getAllUsers();
            return ResponseEntity.status(HttpStatus.CREATED).body(null);
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<List<User>> listUser(@PathVariable long id){
        try{
            User user = userService.getUserById(id);

            if(user != null){
                return ResponseEntity.ok(Collections.singletonList(user));
            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PutMapping(value = "/api/users/{id}")
    public ResponseEntity<User> updateUser(){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @DeleteMapping(value = "/api/users/{id}")
    public ResponseEntity<User> deleteUser(){
        try{
            return null;
        }catch (BackendException ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
