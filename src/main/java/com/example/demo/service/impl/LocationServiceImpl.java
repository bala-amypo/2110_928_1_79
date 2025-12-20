package com.example.demo.service.impl;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final List<Location> locations = new ArrayList<>();

    @Override
    public List<Location> getAllLocations() {
        return locations;
    }

    @Override
    public Location saveLocation(Location location) {
        locations.add(location);
        return location;
    }
}
