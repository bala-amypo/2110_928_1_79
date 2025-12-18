package com.example.demo.controller;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/optimize")
public class RouteOptimizationController {

    private final RouteOptimizationService routeOptimizationService;

    public RouteOptimizationController(RouteOptimizationService routeOptimizationService) {
        this.routeOptimizationService = routeOptimizationService;
    }

    @PostMapping("/{shipmentId}")
    public RouteOptimizationResult optimize(@PathVariable Long shipmentId) {
        return routeOptimizationService.optimizeRoute(shipmentId);
    }

    @GetMapping("/{resultId}")
    public RouteOptimizationResult get(@PathVariable Long resultId) {
        return routeOptimizationService.getResult(resultId);
    }

    @DeleteMapping("/{resultId}")
    public void delete(@PathVariable Long resultId) {
        routeOptimizationService.getResult(resultId);
    }
}
