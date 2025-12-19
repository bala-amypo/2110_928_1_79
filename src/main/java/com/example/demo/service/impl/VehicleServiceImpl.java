package com.example.demo.service.impl;

import com.example.demo.entity.Vehicle;
import com.example.demo.repo.VehicleRepo;
import com.example.demo.service.VehicleService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepo repo;

    public VehicleServiceImpl(VehicleRepo repo) {
        this.repo = repo;
    }

    @Override
    public Vehicle create(Vehicle v) {
        return repo.save(v);
    }

    @Override
    public Vehicle getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    @Override
    public List<Vehicle> getAll() {
        return repo.findAll();
    }

    @Override
    public Vehicle update(Long id, Vehicle v) {
        Vehicle ex = getById(id);
        ex.setVehicleNumber(v.getVehicleNumber());
        ex.setType(v.getType());
        return repo.save(ex);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
