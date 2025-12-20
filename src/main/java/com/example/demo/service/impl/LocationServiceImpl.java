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
    public List<String> getAllLocations() {
        List<String> locationNames = new ArrayList<>();
        for (Location location : locations) {
            locationNames.add(location.getName());
        }
        return locationNames;
    }

    @Override
    public void addLocation(String name) {
        locations.add(new Location(name));
    }
}
