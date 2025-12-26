package com.example.demo.service;

import com.example.demo.entity.*;

import java.util.List;
public interface RouteOptimizationService {
    RouteOptimizationResult optimizeRoute(Long shipmentId);
    RouteOptimizationResult getResult(Long id);
}