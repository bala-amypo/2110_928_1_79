package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // Get vehicles by user
    
    @GetMapping("/user/{userId}")
    public List<Vehicle> getVehiclesByUser(
            @Parameter(description = "ID of the user to fetch vehicles for", required = true)
            @PathVariable Long userId) {
        return vehicleService.getVehiclesByUser(userId);
    }

    // Add a new vehicle
    
    @PostMapping("/{userId}")
    public Vehicle addVehicle(
            @PathVariable Long userId,
            @RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(userId, vehicle);
    }

    // Get vehicle by ID
   
    @GetMapping("/id/{id}")
    public Vehicle getVehicleById(@PathVariable Long id) {
        return vehicleService.findById(id);
    }
}
