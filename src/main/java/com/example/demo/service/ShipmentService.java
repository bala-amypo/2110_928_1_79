package com.example.demo.service;

import com.example.demo.entity.Shipment;

public interface ShipmentService {
    Shipment create(Long vehicleId, Shipment shipment);
    Shipment get(Long id);
    void delete(Long id);
}
