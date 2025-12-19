package com.example.transportpro.service.impl;

import com.example.transportpro.entity.RouteOptimizationResult;
import com.example.transportpro.repo.RouteOptimizationResultRepo;
import com.example.transportpro.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteOptimizationServiceImpl
        implements RouteOptimizationService {

    private final RouteOptimizationResultRepo repo;

    public RouteOptimizationServiceImpl(RouteOptimizationResultRepo repo) {
        this.repo = repo;
    }

    @Override
    public RouteOptimizationResult create(RouteOptimizationResult result) {
        return repo.save(result);
    }

    @Override
    public RouteOptimizationResult getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Route optimization result not found"));
    }

    @Override
    public List<RouteOptimizationResult> getAll() {
        return repo.findAll();
    }

    @Override
    public RouteOptimizationResult update(Long id, RouteOptimizationResult result) {
        RouteOptimizationResult existing = getById(id);
        existing.setDistance(result.getDistance());
        existing.setDuration(result.getDuration());
        return repo.save(existing);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
