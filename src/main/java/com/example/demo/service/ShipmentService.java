package com.example.transportpro.service;

import com.example.transportpro.entity.Shipment;
import java.util.List;

public interface ShipmentService {
    Shipment create(Shipment shipment);
    Shipment getById(Long id);
    List<Shipment> getAll();
    Shipment update(Long id, Shipment shipment);
    void delete(Long id);
}
