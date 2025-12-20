package com.example.demo.service;

import com.example.demo.entity.Location;
import java.util.List;

public interface LocationService {
    List<String> getAllLocations();
    void addLocation(String name);
}
