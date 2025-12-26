package com.example.demo.controller;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @PostMapping
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);  // Correct method
    }

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}
