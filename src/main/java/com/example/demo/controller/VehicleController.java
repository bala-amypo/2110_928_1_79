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

    // POST: add vehicle for a user
    @PostMapping("/{userId}")
    public Vehicle add(@PathVariable Long userId,
                       @RequestBody Vehicle vehicle) {
        return vehicleService.addVehicle(userId, vehicle);
    }

    // GET: all vehicles by user
    @GetMapping("/user/{userId}")
    public List<Vehicle> getByUser(@PathVariable Long userId) {
        return vehicleService.getVehiclesByUser(userId);
    }

    // GET: vehicle by id
    @GetMapping("/{id}")
    public Vehicle getById(@PathVariable Long id) {
        return vehicleService.findById(id);
    }

    // DELETE: delete vehicle
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        vehicleService.delete(id);
    }
}
