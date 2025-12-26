package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class RouteOptimizationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long shipmentId;
    private double optimizedCost;

    // ✅ REQUIRED setters
    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public void setOptimizedCost(double optimizedCost) {
        this.optimizedCost = optimizedCost;
    }

    // getters
    public Long getId() {
        return id;
    }

    public Long getShipmentId() {
        return shipmentId;
    }

    public double getOptimizedCost() {
        return optimizedCost;
    }
}
