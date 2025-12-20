package com.example.transportpro.repository;

import com.example.transportpro.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // Fetch vehicles by userId
    List<Vehicle> findByUserId(Long userId);
}
