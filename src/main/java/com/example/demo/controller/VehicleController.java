package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<String> getAllVehicleNames() {
        return vehicleService.getAllVehicles()
                .stream()
                .map(Vehicle::getName)  // ✅ Correct usage
                .collect(Collectors.toList());
    }

    @PostMapping
    public String addVehicle(@RequestParam String name,
                             @RequestParam String type,
                             @RequestParam double capacityKg,
                             @RequestParam double fuelEfficiency) {
        Vehicle vehicle = new Vehicle(name, type, capacityKg, fuelEfficiency);
        vehicleService.addVehicle(vehicle);
        return "Vehicle added: " + name;
    }
}
