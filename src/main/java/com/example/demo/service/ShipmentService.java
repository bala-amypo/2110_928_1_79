package com.example.demo.service;

import com.example.demo.entity.Shipment;
import java.util.List;

public interface ShipmentService {
    List<Shipment> getAllShipments();
    Shipment getShipmentById(Long id);
    Shipment addShipment(Shipment shipment);
    Shipment updateShipment(Long id, Shipment shipment);
    void deleteShipment(Long id);
}
