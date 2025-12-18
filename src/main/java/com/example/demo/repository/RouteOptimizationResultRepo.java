package com.example.demo.repository;

import com.example.demo.entity.RouteOptimizationResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteOptimizationResultRepo
        extends JpaRepository<RouteOptimizationResult, Long> {
}
