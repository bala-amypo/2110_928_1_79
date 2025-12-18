package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;

@RestController
@RequestMapping("/routes")
public class RouteOptimizationController {

    private final RouteOptimizationService service;

    public RouteOptimizationController(RouteOptimizationService service) {
        this.service = service;
    }

    @PostMapping("/{shipmentId}")
    public RouteOptimizationResult optimize(@PathVariable Long shipmentId) {
        return service.optimize(shipmentId);
    }

    @GetMapping("/{id}")
    public RouteOptimizationResult get(@PathVariable Long id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
