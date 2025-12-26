package com.example.demo.service;

import com.example.demo.entity.Shipment;
import java.util.Optional;

public interface ShipmentService {
    Shipment createShipment(Long userId, Shipment shipment);
    Optional<Shipment> getShipment(Long id);
}
