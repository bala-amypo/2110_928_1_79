package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

@Entity
public class RouteOptimizationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Shipment is required")
    @ManyToOne
    private Shipment shipment;

    @NotNull(message = "Optimized distance is required")
    @Positive(message = "Optimized distance must be positive")
    private Double optimizedDistanceKm;

    @NotNull(message = "Estimated fuel usage is required")
    @Positive(message = "Estimated fuel usage must be positive")
    private Double estimatedFuelUsageL;

    private LocalDateTime generatedAt;

    @PrePersist
    public void onCreate() {
        this.generatedAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Shipment getShipment() { return shipment; }
    public void setShipment(Shipment shipment) { this.shipment = shipment; }

    public Double getOptimizedDistanceKm() { return optimizedDistanceKm; }
    public void setOptimizedDistanceKm(Double optimizedDistanceKm) {
        this.optimizedDistanceKm = optimizedDistanceKm;
    }

    public Double getEstimatedFuelUsageL() { return estimatedFuelUsageL; }
    public void setEstimatedFuelUsageL(Double estimatedFuelUsageL) {
        this.estimatedFuelUsageL = estimatedFuelUsageL;
    }

    public LocalDateTime getGeneratedAt() { return generatedAt; }
}
