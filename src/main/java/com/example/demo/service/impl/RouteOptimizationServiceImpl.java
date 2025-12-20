package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    private final List<RouteOptimizationResult> results = new ArrayList<>();

    @Override
    public List<RouteOptimizationResult> getAllResults() {
        return results;
    }

    @Override
    public void addResult(RouteOptimizationResult result) {
        results.add(result);
    }
}
