package com.example.demo.service.impl;

import com.example.demo.entity.RouteOptimizationResult;
import com.example.demo.entity.Shipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.RouteOptimizationResultRepository;
import com.example.demo.repository.ShipmentRepository;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.RouteOptimizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RouteOptimizationServiceImpl implements RouteOptimizationService {

    @Autowired
    private RouteOptimizationResultRepository resultRepository;

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public RouteOptimizationResult optimizeRoute(Long shipmentId, Long vehicleId) {
        Shipment shipment = shipmentRepository.findById(shipmentId).orElse(null);
        Vehicle vehicle = vehicleRepository.findById(vehicleId).orElse(null);
        if (shipment == null || vehicle == null) return null;

        RouteOptimizationResult result = new RouteOptimizationResult();
        result.setShipment(shipment);
        result.setVehicle(vehicle);
        result.setDistance(10.0); // Simplified fixed distance for example
        return resultRepository.save(result);
    }

    @Override
    public List<RouteOptimizationResult> getAllResults() {
        return resultRepository.findAll();
    }
}
