package com.example.transportpro.controller;

import com.example.transportpro.entity.Location;
import com.example.transportpro.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService service;

    public LocationController(LocationService service) {
        this.service = service;
    }

    @PostMapping
    public Location create(@RequestBody Location location) {
        return service.create(location);
    }

    @GetMapping("/{id}")
    public Location getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Location> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Location update(@PathVariable Long id, @RequestBody Location location) {
        return service.update(id, location);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
