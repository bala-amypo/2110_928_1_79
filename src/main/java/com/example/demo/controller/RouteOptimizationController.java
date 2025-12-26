package com.example.demo.controller;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteOptimizationController {

    @Autowired
    private RouteOptimizationService routeService;

    @PostMapping("/optimize")
    public RouteOptimizationResult optimizeRoute(@RequestParam Long shipmentId,
                                                  @RequestParam Long vehicleId) {
        return routeService.optimizeRoute(shipmentId, vehicleId);
    }

    @GetMapping("/results")
    public List<RouteOptimizationResult> getAllResults() {
        return routeService.getAllResults();
    }
}
