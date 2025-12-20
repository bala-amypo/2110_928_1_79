package com.example.demo.controller;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routeOptimizationResults")
public class RouteOptimizationController {

    private final RouteOptimizationService routeOptimizationService;

    public RouteOptimizationController(RouteOptimizationService routeOptimizationService) {
        this.routeOptimizationService = routeOptimizationService;
    }

    // GET /routeOptimizationResults
    @GetMapping
    public List<RouteOptimizationResult> getAllResults() {
        return routeOptimizationService.getAllResults();
    }

    // POST /routeOptimizationResults
    @PostMapping
    public RouteOptimizationResult saveResult(
            @RequestBody RouteOptimizationResult result) {
        return routeOptimizationService.saveResult(result);
    }
}
