package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public Location create(@RequestBody Location location) {
        return locationService.create(location);
    }

    @GetMapping
    public List<Location> getAll() {
        return locationService.getAll();
    }

    @PutMapping
    public Location update(@RequestBody Location location) {
        return locationService.update(location);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        locationService.delete(id);
    }
}
