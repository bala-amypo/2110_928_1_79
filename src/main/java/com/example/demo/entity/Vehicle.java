package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(unique = true)
    private String vehicleNumber;

    private Double capacityKg;

    private Double fuelEfficiency;

    @OneToMany(mappedBy = "vehicle")
    private List<Shipment> shipments;

    public Vehicle() {}

    public Vehicle(User user, String vehicleNumber, Double capacityKg, Double fuelEfficiency) {
        this.user = user;
        this.vehicleNumber = vehicleNumber;
        this.capacityKg = capacityKg;
        this.fuelEfficiency = fuelEfficiency;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }
 
    public void setUser(User user) {
        this.user = user;
    }
 
    public String getVehicleNumber() {
        return vehicleNumber;
    }
 
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
 
    public Double getCapacityKg() {
        return capacityKg;
    }
 
    public void setCapacityKg(Double capacityKg) {
        this.capacityKg = capacityKg;
    }

    // 🔴 THIS METHOD FIXES YOUR ERROR
    public Double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(Double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}
