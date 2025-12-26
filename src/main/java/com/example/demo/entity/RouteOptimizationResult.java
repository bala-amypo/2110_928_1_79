package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "route_results")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteOptimizationResult {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;

    private LocalDateTime generatedAt = LocalDateTime.now();

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;
}
