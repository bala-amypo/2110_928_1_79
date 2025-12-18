package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.RouteOptimizationResultRepo;
import com.example.demo.repository.ShipmentRepo;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final RouteOptimizationResultRepo repo;
    private final ShipmentRepo shipmentRepo;

    public RouteOptimizationServiceImpl(RouteOptimizationResultRepo repo,
                                        ShipmentRepo shipmentRepo) {
        this.repo = repo;
        this.shipmentRepo = shipmentRepo;
    }

    @Override
    public RouteOptimizationResult optimize(Long shipmentId) {
        Shipment shipment = shipmentRepo.findById(shipmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));

        RouteOptimizationResult r = new RouteOptimizationResult();
        r.setShipment(shipment);
        r.setOptimizedDistanceKm(120.0);
        r.setEstimatedFuelUsageL(12.0);
        return repo.save(r);
    }

    @Override
    public RouteOptimizationResult get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Result not found"));
    }

    @Override
    public void delete(Long id) {
        repo.delete(get(id));
    }
}
