package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class RouteOptimizationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Shipment shipment;

    // ✅ ADDED FIELD
    private String optimizedRoute;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;
    private LocalDateTime generatedAt;

    @PrePersist
    void init() {
        generatedAt = LocalDateTime.now();
    }

    public Long getId() { return id; }

    public Shipment getShipment() { return shipment; }
    public void setShipment(Shipment shipment) { this.shipment = shipment; }

    // ✅ ADDED GETTER
    public String getOptimizedRoute() {
        return optimizedRoute;
    }

    // ✅ ADDED SETTER
    public void setOptimizedRoute(String optimizedRoute) {
        this.optimizedRoute = optimizedRoute;
    }

    public Double getOptimizedDistanceKm() { return optimizedDistanceKm; }
    public void setOptimizedDistanceKm(Double optimizedDistanceKm) {
        this.optimizedDistanceKm = optimizedDistanceKm;
    }

    public Double getEstimatedFuelUsageL() { return estimatedFuelUsageL; }
    public void setEstimatedFuelUsageL(Double estimatedFuelUsageL) {
        this.estimatedFuelUsageL = estimatedFuelUsageL;
    }
}
