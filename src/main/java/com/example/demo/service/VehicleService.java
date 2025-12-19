package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle create(Vehicle v);
    Vehicle getById(Long id);
    List<Vehicle> getAll();
    Vehicle update(Long id, Vehicle v);
    void delete(Long id);
}
