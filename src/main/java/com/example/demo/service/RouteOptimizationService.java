package com.example.demo.service;

import com.example.demo.entity.RouteOptimizationResult;
import java.util.List;

public interface RouteOptimizationService {

    List<RouteOptimizationResult> getAllResults();

    RouteOptimizationResult saveResult(RouteOptimizationResult result); // ✅ ADD
}
