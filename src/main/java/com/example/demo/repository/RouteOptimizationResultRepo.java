package com.example.transportpro.repo;

import com.example.transportpro.entity.RouteOptimizationResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteOptimizationResultRepo
        extends JpaRepository<RouteOptimizationResult, Long> {
}
