package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Vehicle is required")
    @ManyToOne
    private Vehicle vehicle;

    @NotNull(message = "Pickup location is required")
    @ManyToOne
    private Location pickupLocation;

    @NotNull(message = "Drop location is required")
    @ManyToOne
    private Location dropLocation;

    @NotNull(message = "Weight is required")
    @Positive(message = "Weight must be positive")
    private Double weightKg;

    @NotNull(message = "Scheduled date is required")
    @FutureOrPresent(message = "Scheduled date cannot be in the past")
    private LocalDate scheduledDate;

    // getters & setters (unchanged)
}
