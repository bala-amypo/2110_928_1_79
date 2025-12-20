package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vehicle {

    @Id
    private String name;

    private String type;
    private double capacityKg;
    private double fuelEfficiency;

    @ManyToOne
    private User user;  // <-- add this

    // constructors, getters, setters
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
