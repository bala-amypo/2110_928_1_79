package com.example.demo.controller;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routes")
public class RouteOptimizationController {

    private final RouteOptimizationService routeService;

    public RouteOptimizationController(RouteOptimizationService routeService) {
        this.routeService = routeService;
    }

    @PostMapping("/{shipmentId}")
    public RouteOptimizationResult optimize(@PathVariable Long shipmentId) {
        return routeService.optimizeRoute(shipmentId);
    }

    @GetMapping
    public List<RouteOptimizationResult> getAllResults() {
        return routeService.getAllResults();
    }
}
