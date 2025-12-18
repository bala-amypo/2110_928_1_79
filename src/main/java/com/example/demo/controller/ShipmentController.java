package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Shipment;
import com.example.demo.service.ShipmentService;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService shipmentService;

    public ShipmentController(ShipmentService shipmentService) {
        this.shipmentService = shipmentService;
    }

    @PostMapping("/{vehicleId}")
    public Shipment create(@PathVariable Long vehicleId,
                           @RequestBody Shipment shipment) {
        return shipmentService.create(vehicleId, shipment);
    }

    @GetMapping("/{id}")
    public Shipment get(@PathVariable Long id) {
        return shipmentService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        shipmentService.delete(id);
    }
}
