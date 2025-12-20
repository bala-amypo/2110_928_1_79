package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.ShipmentService;

import java.time.LocalDate;

public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final VehicleRepository vehicleRepository;
    private final LocationRepository locationRepository;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository,
                               VehicleRepository vehicleRepository,
                               LocationRepository locationRepository) {
        this.shipmentRepository = shipmentRepository;
        this.vehicleRepository = vehicleRepository;
        this.locationRepository = locationRepository;
    }

    public Shipment createShipment(Long vehicleId, Shipment shipment) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

        if (shipment.getWeightKg() > vehicle.getCapacityKg()) {
            throw new IllegalArgumentException("Weight exceeds capacity");
        }

        if (shipment.getScheduledDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date is in the past");
        }

        Location pickup = locationRepository.findById(shipment.getPickupLocation().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Location not found"));

        Location drop = locationRepository.findById(shipment.getDropLocation().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Location not found"));

        shipment.setVehicle(vehicle);
        shipment.setPickupLocation(pickup);
        shipment.setDropLocation(drop);

        return shipmentRepository.save(shipment);
    }

    public Shipment getShipment(Long shipmentId) {
        return shipmentRepository.findById(shipmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
    }
}
