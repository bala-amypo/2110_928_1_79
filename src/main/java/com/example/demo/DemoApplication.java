package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {  // ✅ class name matches file name

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
