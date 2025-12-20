package com.example.demo.controller;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.web.bind.annotation.*;

@RestController
public class RouteOptimizationController {

    private final RouteOptimizationService routeOptimizationService;

    public RouteOptimizationController(RouteOptimizationService routeOptimizationService) {
        this.routeOptimizationService = routeOptimizationService;
    }

    // GET /optimize/{shipmentId}
    @GetMapping("/optimize/{shipmentId}")
    public RouteOptimizationResult optimizeRoute(@PathVariable Long shipmentId) {
        return routeOptimizationService.optimize(shipmentId);
    }
}
