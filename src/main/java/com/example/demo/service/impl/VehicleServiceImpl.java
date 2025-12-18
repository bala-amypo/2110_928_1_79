package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.Vehicle;
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
        User user = userRepo.findById(userId).orElse(null);
        vehicle.setUser(user);
        return vehicleRepo.save(vehicle);
    }

    @Override
    public List<Vehicle> getVehiclesByUser(Long userId) {
        return vehicleRepo.findByUserId(userId);
    }

    @Override
    public Vehicle findById(Long id) {
        return vehicleRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        vehicleRepo.deleteById(id);
    }
}
