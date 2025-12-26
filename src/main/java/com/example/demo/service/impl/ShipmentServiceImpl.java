package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.ShipmentService;
import java.util.Optional;

public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    public Shipment createShipment(Long userId, Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    public Optional<Shipment> getShipment(Long id) {
        return shipmentRepository.findById(id);
    }
}
