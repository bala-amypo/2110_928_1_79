package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // GET /vehicles/{userId}
    @GetMapping("/{userId}")
    public List<Vehicle> getVehiclesByUserId(@PathVariable Long userId) {
        return vehicleService.getVehiclesByUserId(userId);
    }

    // GET /vehicles/user/{userId}
    @GetMapping("/user/{userId}")
    public List<Vehicle> getVehiclesForUser(@PathVariable Long userId) {
        return vehicleService.getVehiclesByUserId(userId);
    }
}
