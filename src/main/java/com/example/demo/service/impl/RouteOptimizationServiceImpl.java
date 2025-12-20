package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final ShipmentRepository shipmentRepository;
    private final RouteOptimizationResultRepository resultRepository;

    public RouteOptimizationServiceImpl(ShipmentRepository shipmentRepository,
                                        RouteOptimizationResultRepository resultRepository) {
        this.shipmentRepository = shipmentRepository;
        this.resultRepository = resultRepository;
    }

    public RouteOptimizationResult optimizeRoute(Long shipmentId) {
        Shipment shipment = shipmentRepository.findById(shipmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));

        double distance = Math.hypot(
                shipment.getPickupLocation().getLatitude() - shipment.getDropLocation().getLatitude(),
                shipment.getPickupLocation().getLongitude() - shipment.getDropLocation().getLongitude()
        );

        if (distance <= 0) distance = 10;

        double fuel = distance / shipment.getVehicle().getFuelEfficiency();

        RouteOptimizationResult result =
                new RouteOptimizationResult(shipment, distance, fuel, LocalDateTime.now());

        return resultRepository.save(result);
    }

    public RouteOptimizationResult getResult(Long resultId) {
        return resultRepository.findById(resultId)
                .orElseThrow(() -> new ResourceNotFoundException("Result not found"));
    }
}
