package com.example.transportpro.service;

import com.example.transportpro.entity.RouteOptimizationResult;
import java.util.List;

public interface RouteOptimizationService {

    RouteOptimizationResult create(RouteOptimizationResult result);

    RouteOptimizationResult getById(Long id);

    List<RouteOptimizationResult> getAll();

    RouteOptimizationResult update(Long id, RouteOptimizationResult result);

    void delete(Long id);
}
