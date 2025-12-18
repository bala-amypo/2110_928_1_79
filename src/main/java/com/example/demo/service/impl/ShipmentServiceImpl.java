package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.ShipmentRepo;
import com.example.demo.repository.VehicleRepo;
import com.example.demo.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepo shipmentRepo;
    private final VehicleRepo vehicleRepo;


    public ShipmentServiceImpl(ShipmentRepo shipmentRepo,
                           VehicleRepo vehicleRepo) {
    this.shipmentRepo = shipmentRepo;
    this.vehicleRepo = vehicleRepo;
}


    @Override
    public Shipment create(Long vehicleId, Shipment shipment) {
        Vehicle vehicle = vehicleRepo.findById(vehicleId).orElse(null);
        shipment.setVehicle(vehicle);
        return shipmentRepo.save(shipment);
    }

    @Override
    public Shipment get(Long id) {
        return shipmentRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        shipmentRepo.deleteById(id);
    }
}
