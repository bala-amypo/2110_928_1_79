package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public User get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User update(User user) {
        return repo.save(user);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
