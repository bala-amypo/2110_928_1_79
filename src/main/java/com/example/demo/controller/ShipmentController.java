package com.example.transportpro.controller;

import com.example.transportpro.entity.Shipment;
import com.example.transportpro.service.ShipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shipments")
public class ShipmentController {

    private final ShipmentService service;

    public ShipmentController(ShipmentService service) {
        this.service = service;
    }

    @PostMapping
    public Shipment create(@RequestBody Shipment shipment) {
        return service.create(shipment);
    }

    @GetMapping("/{id}")
    public Shipment getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Shipment> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Shipment update(@PathVariable Long id, @RequestBody Shipment shipment) {
        return service.update(id, shipment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
