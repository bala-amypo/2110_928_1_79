package com.example.transportpro.controller;

import com.example.transportpro.entity.RouteOptimizationResult;
import com.example.transportpro.service.RouteOptimizationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/route-optimizations")
public class RouteOptimizationController {

    private final RouteOptimizationService service;

    public RouteOptimizationController(RouteOptimizationService service) {
        this.service = service;
    }

    @PostMapping
    public RouteOptimizationResult create(@RequestBody RouteOptimizationResult result) {
        return service.create(result);
    }

    @GetMapping("/{id}")
    public RouteOptimizationResult getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<RouteOptimizationResult> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public RouteOptimizationResult update(
            @PathVariable Long id,
            @RequestBody RouteOptimizationResult result) {
        return service.update(id, result);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
