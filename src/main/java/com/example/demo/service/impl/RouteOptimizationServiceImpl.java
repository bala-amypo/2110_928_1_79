package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.repository.RouteOptimizationResultRepo;
import com.example.demo.service.RouteOptimizationService;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    // ✅ FIXED: use Repo (not Repository)
    private final RouteOptimizationResultRepo repository;

    // ✅ FIXED constructor
    public RouteOptimizationServiceImpl(RouteOptimizationResultRepo repository) {
        this.repository = repository;
    }

    @Override
    public RouteOptimizationResult optimize(Long shipmentId) {
        RouteOptimizationResult result = new RouteOptimizationResult();
        result.setOptimizedRoute("Optimized route for shipment " + shipmentId);
        return repository.save(result);
    }

    @Override
    public RouteOptimizationResult get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
