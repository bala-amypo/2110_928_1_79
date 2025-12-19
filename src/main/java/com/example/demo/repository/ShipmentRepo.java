package com.example.transportpro.repo;

import com.example.transportpro.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepo extends JpaRepository<Shipment, Long> {
}
