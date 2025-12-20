package com.example.demo.service.impl;

import com.example.demo.entity.Vehicle;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShipmentServiceImpl {

    public double calculateTotalCapacity(List<Vehicle> vehicles) {
        return vehicles.stream().mapToDouble(Vehicle::getCapacityKg).sum();
    }
}
