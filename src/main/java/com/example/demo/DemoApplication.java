// DemoApplication.java
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {   // ✅ Must match filename
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
