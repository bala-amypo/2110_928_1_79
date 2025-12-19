package com.example.transportpro.service;

import com.example.transportpro.entity.User;
import java.util.List;

public interface UserService {
    User create(User user);
    User getById(Long id);
    List<User> getAll();
    User update(Long id, User user);
    void delete(Long id);
}
