package com.example.transportpro.service.impl;

import com.example.transportpro.entity.Location;
import com.example.transportpro.repo.LocationRepo;
import com.example.transportpro.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepo repo;

    public LocationServiceImpl(LocationRepo repo) {
        this.repo = repo;
    }

    public Location create(Location location) {
        return repo.save(location);
    }

    public Location getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found"));
    }

    public List<Location> getAll() {
        return repo.findAll();
    }

    public Location update(Long id, Location location) {
        Location l = getById(id);
        l.setName(location.getName());
        l.setLatitude(location.getLatitude());
        l.setLongitude(location.getLongitude());
        return repo.save(l);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
