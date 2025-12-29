// package com.example.demo.controller;

// import com.example.demo.entity.Location;
// import com.example.demo.service.LocationService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/locations")
// public class LocationController {

//     private final LocationService locationService;

//     public LocationController(LocationService locationService) {
//         this.locationService = locationService;
//     }

//     @PostMapping
//     public Location create(@RequestBody Location location) {
//         return locationService.createLocation(location);
//     }

//     @GetMapping
//     public List<Location> getAll() {
//         return locationService.getAllLocations();
//     }
// }
package com.example.demo.controller;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private final LocationService locationService;

    // Constructor injection
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    // Create Location
    @PostMapping(
            consumes = "application/json",
            produces = "application/json"
    )
    public Location createLocation(@RequestBody Location location) {
        return locationService.createLocation(location);
    }

    // Get All Locations
    @GetMapping(produces = "application/json")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }
}