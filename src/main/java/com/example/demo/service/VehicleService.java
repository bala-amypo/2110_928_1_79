package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;
import java.util.List;

public interface VehicleService {
    List<Vehicle> getVehiclesByUser(Long userId);
    Vehicle addVehicle(Long userId, Vehicle vehicle);
    Vehicle findById(Long id) throws ResourceNotFoundException;
}
