package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicle {

    @Id
    private String name;  // Primary key

    private String type;
    private double capacityKg;
    private double fuelEfficiency;

    @ManyToOne
    private User user; // Optional: for User-vehicles relationship

    public Vehicle() {}

    public Vehicle(String name, String type, double capacityKg, double fuelEfficiency) {
        this.name = name;
        this.type = type;
        this.capacityKg = capacityKg;
        this.fuelEfficiency = fuelEfficiency;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getCapacityKg() { return capacityKg; }
    public void setCapacityKg(double capacityKg) { this.capacityKg = capacityKg; }

    public double getFuelEfficiency() { return fuelEfficiency; }
    public void setFuelEfficiency(double fuelEfficiency) { this.fuelEfficiency = fuelEfficiency; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
