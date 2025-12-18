package com.example.demo.service.impl;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationRepo;
import com.example.demo.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepo repo;

    public LocationServiceImpl(LocationRepo repo) {
        this.repo = repo;
    }

    private void validate(Location l) {
        if (l.getLatitude() < -90 || l.getLatitude() > 90) {
            throw new IllegalArgumentException("Invalid latitude");
        }
    }

    @Override
    public Location create(Location location) {
        validate(location);
        return repo.save(location);
    }

    @Override
    public Location update(Location location) {
        validate(location);
        return repo.save(location);
    }

    @Override
    public List<Location> getAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
