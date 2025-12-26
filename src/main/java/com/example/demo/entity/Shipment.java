package com.example.demo.entity;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Shipment {
    private Long id;
    private double weightKg;
    private Long sourceLocationId;
    private Long destinationLocationId;
    private Long vehicleId;
}
