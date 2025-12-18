package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;
    private final VehicleRepository vehicleRepository;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository,
                               VehicleRepository vehicleRepository) {
        this.shipmentRepository = shipmentRepository;
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Shipment create(Long vehicleId, Shipment shipment) {
        Vehicle vehicle = vehicleRepository.findById(vehicleId).orElse(null);
        shipment.setVehicle(vehicle);
        return shipmentRepository.save(shipment);
    }

    @Override
    public Shipment get(Long id) {
        return shipmentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        shipmentRepository.deleteById(id);
    }
}
