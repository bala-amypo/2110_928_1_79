package com.example.demo.service;

import com.example.demo.entity.RouteOptimizationResult;

public interface RouteOptimizationService {
    RouteOptimizationResult optimize(Long shipmentId);
    RouteOptimizationResult get(Long id);
    void delete(Long id);
}
