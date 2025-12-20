package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    // Dummy in-memory list of locations
    private final List<String> locations = new ArrayList<>();

    public List<String> getAllLocations() {
        return locations;
    }

    public void addLocation(String location) {
        locations.add(location);
    }
}
