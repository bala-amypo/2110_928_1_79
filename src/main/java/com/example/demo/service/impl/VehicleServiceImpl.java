package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepo;
import com.example.demo.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo repo;

    public VehicleServiceImpl(VehicleRepo repo) {
        this.repo = repo;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return repo.save(vehicle);
    }

    @Override
    public Vehicle findById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return repo.save(vehicle);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
