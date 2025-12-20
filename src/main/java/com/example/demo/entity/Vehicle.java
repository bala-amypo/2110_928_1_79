package com.example.demo.entity;

public class Vehicle {

    private String name;
    private String type;
    private double capacityKg;       // Added field
    private double fuelEfficiency;   // Added field (km/l or similar)

    public Vehicle() { }

    public Vehicle(String name, String type, double capacityKg, double fuelEfficiency) {
        this.name = name;
        this.type = type;
        this.capacityKg = capacityKg;
        this.fuelEfficiency = fuelEfficiency;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapacityKg() {
        return capacityKg;
    }

    public void setCapacityKg(double capacityKg) {
        this.capacityKg = capacityKg;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }
}
