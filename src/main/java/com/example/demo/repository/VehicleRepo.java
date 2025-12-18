package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Vehicle;

import java.util.List;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

    // ✅ ADD THIS METHOD
    List<Vehicle> findByUserId(Long userId);
}
