package com.backend.api.controller;

import com.backend.api.entity.User;
import com.backend.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @PostMapping(value = "/api/users")
    public ResponseEntity<User> createUser(@RequestBody User user){

    }

    @GetMapping(value = "/api/users")
    public ResponseEntity<List<User>> listAllUsers(){

    }

    @GetMapping(value = "/api/users/{id}")
    public ResponseEntity<List<User>> listUser(@PathVariable long userId){

    }

    @PutMapping(value = "/api/users/{id}")
    public ResponseEntity<User> updateUser(){

    }

    @DeleteMapping(value = "/api/users/{id}")


}
