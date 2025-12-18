package com.example.demo.service;

import com.example.demo.entity.Vehicle;

public interface VehicleService {

    Vehicle create(Vehicle vehicle);
    Vehicle findById(Long id);
    Vehicle update(Vehicle vehicle);
    void delete(Long id);
}
