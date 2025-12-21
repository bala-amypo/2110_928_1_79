package com.example.demo.service;

import com.example.demo.entity.Location;
import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ValidationService {

    // Validate Vehicle
    public void validateVehicle(Vehicle vehicle) {
        if (vehicle.getCapacityKg() == null || vehicle.getCapacityKg() <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        // Additional vehicle validations can be added here
    }

    // Validate Location
    public void validateLocation(Location location) {
        if (location.getLatitude() == null || location.getLatitude() < -90 || location.getLatitude() > 90) {
            throw new IllegalArgumentException("Invalid latitude value");
        }
        if (location.getLongitude() == null || location.getLongitude() < -180 || location.getLongitude() > 180) {
            throw new IllegalArgumentException("Invalid longitude value");
        }
        // Additional location validations can be added here
    }

    // Validate Shipment
    public void validateShipment(Shipment shipment) {
        if (shipment.getVehicle() == null) {
            throw new IllegalArgumentException("Shipment must have a vehicle assigned");
        }
        if (shipment.getWeightKg() == null || shipment.getWeightKg() > shipment.getVehicle().getCapacityKg()) {
            throw new IllegalArgumentException("Weight exceeds vehicle capacity");
        }
        if (shipment.getScheduledDate() == null || shipment.getScheduledDate().isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Date cannot be in the past");
        }
        // Additional shipment validations can be added here
    }

    // Validate RouteOptimizationResult (optional, e.g., distance/fuel)
    public void validateRouteResult(double distanceKm, double fuelUsageL) {
        if (distanceKm <= 0) {
            throw new IllegalArgumentException("Optimized distance must be positive");
        }
        if (fuelUsageL <= 0) {
            throw new IllegalArgumentException("Estimated fuel usage must be positive");
        }
    }
}
