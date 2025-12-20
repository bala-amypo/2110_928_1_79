package com.example.demo.service.impl;

import com.example.demo.service.LocationService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final List<String> locations = new ArrayList<>();

    @Override
    public List<String> getAllLocations() {
        return locations;
    }

    @Override
    public void addLocation(String location) {
        locations.add(location);
    }
}
