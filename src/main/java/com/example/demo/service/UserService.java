package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    User create(User user);

    User get(Long id);

    User update(User user);

    void delete(Long id);
}
