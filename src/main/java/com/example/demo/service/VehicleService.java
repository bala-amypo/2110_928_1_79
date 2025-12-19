package com.example.transportpro.service;

import com.example.transportpro.entity.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle create(Vehicle vehicle);
    Vehicle getById(Long id);
    List<Vehicle> getAll();
    Vehicle update(Long id, Vehicle vehicle);
    void delete(Long id);
}
