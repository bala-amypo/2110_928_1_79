package com.example.demo.security;

public class JwtUtil {

    private String secret;
    private int expiration;

    public JwtUtil() {}

    public JwtUtil(String secret, int expiration) {
        this.secret = secret;
        this.expiration = expiration;
    }

    public String generateToken(Long userId, String email, String role) {
        return userId + ":" + email + ":" + role;
    }

    public boolean validateToken(String token) {
        return token != null && token.split(":").length == 3;
    }
}
