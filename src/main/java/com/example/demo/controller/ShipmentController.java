package com.example.demo.controller;

import com.example.demo.entity.Shipment;
import com.example.demo.service.ShipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    // GET /shipments/{vehicleId}
    @GetMapping("/{vehicleId}")
    public List<Shipment> getShipmentsByVehicleId(@PathVariable Long vehicleId) {
        return shipmentService.getShipmentsByVehicleId(vehicleId);
    }

    // GET /shipments/shipment/{shipmentId}
    @GetMapping("/shipment/{shipmentId}")
    public Shipment getShipmentById(@PathVariable Long shipmentId) {
        return shipmentService.getShipmentById(shipmentId);
    }
}
