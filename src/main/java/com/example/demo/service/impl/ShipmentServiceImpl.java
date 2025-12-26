package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public Shipment addShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @Override
    public List<Shipment> getAllShipments() {
        return shipmentRepository.findAll();
    }
}
