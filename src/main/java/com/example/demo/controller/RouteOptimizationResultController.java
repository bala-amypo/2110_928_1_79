package com.example.demo.controller;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routeOptimizationResults")
public class RouteOptimizationResultController {

    private final RouteOptimizationService service;

    public RouteOptimizationResultController(RouteOptimizationService service) {
        this.service = service;
    }

    @GetMapping
    public List<RouteOptimizationResult> getAllResults() {
        return service.getAllResults();
    }

    @PostMapping
    public String addResult(@RequestParam String id,
                            @RequestParam String routeDescription,
                            @RequestParam double totalDistanceKm,
                            @RequestParam double estimatedFuelConsumption) {
        RouteOptimizationResult result = new RouteOptimizationResult(id, routeDescription, totalDistanceKm, estimatedFuelConsumption);
        service.addResult(result);
        return "Route optimization result added: " + id;
    }
}
