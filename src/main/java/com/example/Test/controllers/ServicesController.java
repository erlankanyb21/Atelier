package com.example.Test.controllers;

import com.example.Test.models.Services;
import com.example.Test.service.ServicesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping("v1/atelier/services")
public class ServicesController {

    private final ServicesService servicesService;

    public ServicesController(ServicesService servicesService) {
        this.servicesService = servicesService;
    }

    @PostMapping(path = "/item")
    public ResponseEntity<Void> createServices(@RequestBody Services home) {
        servicesService.createServices(home);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Services> getServicesById(@PathVariable Long id) {
        Services home = servicesService.getServicesById(id);
        return new ResponseEntity<>(home, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Services>> getAllServices() {
        List<Services> worksList = servicesService.getAllServices();
        return new ResponseEntity<>(worksList, HttpStatus.OK);
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Void> deleteServicesById(@PathVariable Long id) {
        servicesService.deleteServicesById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Void> updateServices(@PathVariable Long id, @RequestBody Services home) {
        servicesService.updateServices(id, home);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
