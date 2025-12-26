package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final RouteOptimizationResultRepository repository;

    public RouteOptimizationServiceImpl(RouteOptimizationResultRepository repository) {
        this.repository = repository;
    }

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId) {
        RouteOptimizationResult result = new RouteOptimizationResult();
        result.setShipmentId(shipmentId);
        result.setOptimizedCost(1200.0);
        return repository.save(result);
    }

    @Override
    public List<RouteOptimizationResult> getAllResults() {
        return repository.findAll();
    }
}
