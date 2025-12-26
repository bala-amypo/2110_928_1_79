package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final RouteOptimizationResultRepository resultRepository;
    private final ShipmentRepository shipmentRepository;

    public RouteOptimizationServiceImpl(RouteOptimizationResultRepository resultRepository,
                                        ShipmentRepository shipmentRepository) {
        this.resultRepository = resultRepository;
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId, Long vehicleId) {

        Shipment shipment = shipmentRepository.findById(shipmentId)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));

        RouteOptimizationResult result = RouteOptimizationResult.builder()
                .distance(120.5)
                .estimatedTime(4.5)
                .shipment(shipment)
                .build();

        return resultRepository.save(result);
    }

    @Override
    public RouteOptimizationResult getResult(Long shipmentId) {
        return resultRepository.findByShipmentId(shipmentId)
                .orElseThrow(() -> new RuntimeException("Result not found"));
    }

    @Override
    public List<RouteOptimizationResult> getAllResults() {
        return resultRepository.findAll();   // ✅ REQUIRED
    }
}
