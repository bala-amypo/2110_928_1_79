package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Shipment {

    @Id
    private String shipmentId;

    @ManyToOne
    private Vehicle vehicle;

    public Shipment() {}

    public Shipment(String shipmentId, Vehicle vehicle) {
        this.shipmentId = shipmentId;
        this.vehicle = vehicle;
    }

    public String getShipmentId() { return shipmentId; }
    public void setShipmentId(String shipmentId) { this.shipmentId = shipmentId; }

    public Vehicle getVehicle() { return vehicle; }
    public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
}
