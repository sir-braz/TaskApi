package com.backend.api.service;

import com.backend.api.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void deleteUserById(Long id);
}
