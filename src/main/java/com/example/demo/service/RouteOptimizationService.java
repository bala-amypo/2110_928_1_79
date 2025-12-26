package com.example.demo.service;

import com.example.demo.entity.RouteOptimizationResult;
import java.util.List;

public interface RouteOptimizationService {
    RouteOptimizationResult optimizeRoute(Long shipmentId);
    List<RouteOptimizationResult> getAllResults();
}
