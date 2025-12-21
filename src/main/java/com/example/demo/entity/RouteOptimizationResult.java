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

    @NotNull(message = "Fuel usage is required")
    @Positive(message = "Fuel usage must be positive")
    private Double estimatedFuelUsageL;

    private LocalDateTime generatedAt;

    @PrePersist
    public void onCreate() {
        this.generatedAt = LocalDateTime.now();
    }

    // getters & setters (unchanged)
}
