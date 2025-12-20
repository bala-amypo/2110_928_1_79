package com.example.demo.service;

import java.util.List;
@Service
public interface LocationService {
    List<String> getAllLocations();
    void addLocation(String location);
}
