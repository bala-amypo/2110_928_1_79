package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.ShipmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepository shipmentRepository;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }

    @Override
    public Shipment getShipmentById(Long id) {
        return shipmentRepository.findById(id).orElse(null);
    }

    @Override
    public Shipment addShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @Override
    public Shipment updateShipment(Long id, Shipment updatedShipment) {
        return shipmentRepository.findById(id).map(shipment -> {
            shipment.setName(updatedShipment.getName());        // ✅ now exists
            shipment.setLocation(updatedShipment.getLocation());// ✅ now exists
            shipment.setVehicle(updatedShipment.getVehicle());
            return shipmentRepository.save(shipment);
        }).orElse(null);
    }

    @Override
    public void deleteShipment(Long id) {
        shipmentRepository.deleteById(id);
    }
}
