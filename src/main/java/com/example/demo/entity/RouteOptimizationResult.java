package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteOptimizationResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsageL;

    private LocalDateTime generatedAt;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;
}
