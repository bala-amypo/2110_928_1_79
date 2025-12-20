package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RouteOptimizationResult {

    @Id
    private String id;  // Unique identifier

    private String routeDescription;
    private double totalDistanceKm;
    private double estimatedFuelConsumption;

    public RouteOptimizationResult() {}

    public RouteOptimizationResult(String id, String routeDescription, double totalDistanceKm, double estimatedFuelConsumption) {
        this.id = id;
        this.routeDescription = routeDescription;
        this.totalDistanceKm = totalDistanceKm;
        this.estimatedFuelConsumption = estimatedFuelConsumption;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getRouteDescription() { return routeDescription; }
    public void setRouteDescription(String routeDescription) { this.routeDescription = routeDescription; }

    public double getTotalDistanceKm() { return totalDistanceKm; }
    public void setTotalDistanceKm(double totalDistanceKm) { this.totalDistanceKm = totalDistanceKm; }

    public double getEstimatedFuelConsumption() { return estimatedFuelConsumption; }
    public void setEstimatedFuelConsumption(double estimatedFuelConsumption) { this.estimatedFuelConsumption = estimatedFuelConsumption; }
}
