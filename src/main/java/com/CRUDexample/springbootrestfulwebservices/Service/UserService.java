package com.CRUDexample.springbootrestfulwebservices.Service;

import java.util.List;

import com.CRUDexample.springbootrestfulwebservices.Entity.User;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}