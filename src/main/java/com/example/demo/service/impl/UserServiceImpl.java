package com.example.transportpro.service.impl;

import com.example.transportpro.entity.User;
import com.example.transportpro.repo.UserRepo;
import com.example.transportpro.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    public User create(User user) {
        return repo.save(user);
    }

    public User getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User update(Long id, User user) {
        User u = getById(id);
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        return repo.save(u);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
