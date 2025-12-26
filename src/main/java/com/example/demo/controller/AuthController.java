package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // ✅ REGISTER
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        User user = userService.login(request.getEmail(), request.getPassword());

        if (user == null) {
            return ResponseEntity.status(401).body("Invalid email or password");
        }

        return ResponseEntity.ok(user);
    }
}
