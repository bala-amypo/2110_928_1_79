package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;
public interface ShipmentService {
    Shipment createShipment(Long vehicleId, Shipment shipment);
    Shipment getShipment(Long id);
}