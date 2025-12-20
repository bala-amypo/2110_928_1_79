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

    // Endpoint 1: /vehicles/{userId}
    
    @GetMapping("/{userId}")
    public List<Vehicle> getVehiclesByUserId(
            @Parameter(description = "ID of the user to fetch vehicles for", required = true)
            @PathVariable Long userId) {
        return vehicleService.getVehiclesByUserId(userId);
    }

    // Endpoint 2: /vehicles/user/{userId} (optional)
    
    @GetMapping("/user/{userId}")
    public List<Vehicle> getVehiclesByUserIdAlternative(
            @Parameter(description = "ID of the user to fetch vehicles for", required = true)
            @PathVariable Long userId) {
        return vehicleService.getVehiclesByUserId(userId);
    }
}
