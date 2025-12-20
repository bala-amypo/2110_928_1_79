package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.RouteOptimizationService;

public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final ShipmentRepository shipmentRepo;
    private final RouteOptimizationResultRepository resultRepo;

    public RouteOptimizationServiceImpl(ShipmentRepository shipmentRepo,
                                        RouteOptimizationResultRepository resultRepo) {
        this.shipmentRepo = shipmentRepo;
        this.resultRepo = resultRepo;
    }

    public RouteOptimizationResult optimizeRoute(Long shipmentId) {
        Shipment shipment = shipmentRepo.findById(shipmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));

        RouteOptimizationResult result = new RouteOptimizationResult();
        result.setShipment(shipment);
        result.setOptimizedDistanceKm(100.0);
        result.setEstimatedFuelUsageL(10.0);

        return resultRepo.save(result);
    }

    public RouteOptimizationResult getResult(Long resultId) {
        return resultRepo.findById(resultId)
                .orElseThrow(() -> new ResourceNotFoundException("Result not found"));
    }
}
