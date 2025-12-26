package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String vehicleNumber;

    private Double capacityKg;
    private Double fuelEfficiency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
