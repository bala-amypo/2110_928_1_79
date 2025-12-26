package com.example.demo.service;

import com.example.demo.entity.User;
import java.util.List;

public interface UserService {
    User login(String email, String password);
    User register(User user);
    List<User> getAllUsers();
}
