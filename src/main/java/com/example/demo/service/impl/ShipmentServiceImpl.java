package com.example.demo.service.impl;

import com.example.demo.entity.Shipment;
import com.example.demo.service.ShipmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final List<Shipment> shipments = new ArrayList<>();

    @Override
    public List<Shipment> getAllShipments() {
        return shipments;
    }

    @Override
    public Shipment saveShipment(Shipment shipment) {
        shipments.add(shipment);
        return shipment;
    }
}
