package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Vehicle vehicle;

    private String location;

    public Shipment() {}

    public Shipment(String name, Vehicle vehicle, String location) {
        this.name = name;
        this.vehicle = vehicle;
        this.location = location;
    }

    // ===== GETTERS & SETTERS =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {           // ✅ REQUIRED
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getLocation() {       // ✅ REQUIRED
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
