package com.example.demo.controller;

import com.example.demo.service.LocationService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<String> getAllLocations() { return locationService.getAllLocations(); }

    @PostMapping
    public String addLocation(@RequestParam String name) {
        locationService.addLocation(name);
        return "Location added: " + name;
    }
}
