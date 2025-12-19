package com.example.transportpro.service.impl;

import com.example.transportpro.entity.Shipment;
import com.example.transportpro.repo.ShipmentRepo;
import com.example.transportpro.service.ShipmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final ShipmentRepo repo;

    public ShipmentServiceImpl(ShipmentRepo repo) {
        this.repo = repo;
    }

    public Shipment create(Shipment shipment) {
        return repo.save(shipment);
    }

    public Shipment getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Shipment not found"));
    }

    public List<Shipment> getAll() {
        return repo.findAll();
    }

    public Shipment update(Long id, Shipment shipment) {
        Shipment s = getById(id);
        s.setSource(shipment.getSource());
        s.setDestination(shipment.getDestination());
        s.setStatus(shipment.getStatus());
        return repo.save(s);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
