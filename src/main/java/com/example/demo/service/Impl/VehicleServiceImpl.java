package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.repository.VehicleRepo;
import com.example.demo.service.VehicleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo vehicleRepo;
    private final UserRepo userRepo;

    public VehicleServiceImpl(VehicleRepo vehicleRepo, UserRepo userRepo) {
        this.vehicleRepo = vehicleRepo;
        this.userRepo = userRepo;
    }

    @Override
    public Vehicle addVehicle(Long userId, Vehicle vehicle) {
        if (vehicle.getCapacityKg() <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }

        User user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        vehicle.setUser(user);
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> getVehiclesByUser(Long userId) {
        return vehicleRepo.findByUserId(userId);
    }

    @Override
    public Vehicle findById(Long id) {
        return vehicleRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));
    }

    @Override
    public void delete(Long id) {
        vehicleRepo.delete(findById(id));
    }
}
