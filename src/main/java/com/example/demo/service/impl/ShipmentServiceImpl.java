package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ShipmentRepo;
import com.example.demo.repository.VehicleRepo;
import com.example.demo.service.ShipmentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepo repo;
    private final VehicleRepo vehicleRepo;

    public ShipmentServiceImpl(ShipmentRepo repo, VehicleRepo vehicleRepo) {
        this.repo = repo;
        this.vehicleRepo = vehicleRepo;
    }

    @Override
    public Shipment create(Long vehicleId, Shipment shipment) {

        Vehicle vehicle = vehicleRepo.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        if (shipment.getWeightKg() > vehicle.getCapacityKg()) {
            throw new IllegalArgumentException("Weight exceeds capacity");
        }

        if (shipment.getScheduledDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date in the past");
        }

        shipment.setVehicle(vehicle);
        return repo.save(shipment);
    }

    @Override
    public Shipment get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
    }

    @Override
    public void delete(Long id) {
        repo.delete(get(id));
    }
}
