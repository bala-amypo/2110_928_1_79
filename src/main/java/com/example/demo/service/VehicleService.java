package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Vehicle;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    void addVehicle(Vehicle vehicle);
}
