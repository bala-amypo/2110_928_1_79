package com.example.demo.service;

import com.example.demo.entity.RouteOptimizationResult;
import java.util.List;

public interface RouteOptimizationService {

    RouteOptimizationResult optimizeRoute(Long shipmentId, Long vehicleId);

    RouteOptimizationResult getResult(Long shipmentId);

    List<RouteOptimizationResult> getAllResults();   // ✅ must be implemented
}
