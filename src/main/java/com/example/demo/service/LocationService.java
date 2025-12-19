package com.example.transportpro.service;

import com.example.transportpro.entity.Location;
import java.util.List;

public interface LocationService {
    Location create(Location location);
    Location getById(Long id);
    List<Location> getAll();
    Location update(Long id, Location location);
    void delete(Long id);
}
