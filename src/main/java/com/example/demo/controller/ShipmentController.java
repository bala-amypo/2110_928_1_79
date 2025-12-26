package com.example.demo.controller;

import com.example.demo.entity.Shipment;
import com.example.demo.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @PostMapping
    public Shipment addShipment(@RequestBody Shipment shipment) {
        return shipmentService.addShipment(shipment);  // Correct method
    }

    @GetMapping
    public List<Shipment> getAllShipments() {
        return shipmentService.getAllShipments();
    }
}
