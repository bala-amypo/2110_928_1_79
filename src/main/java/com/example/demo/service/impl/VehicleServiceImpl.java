package com.example.demo.service.impl;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
