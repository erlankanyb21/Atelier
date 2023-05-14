package com.example.Test.controllers;

import com.example.Test.models.Home;
import com.example.Test.service.HomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping("v1/atelier/home")
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @PostMapping(path = "/item")
    public ResponseEntity<Void> createWorks(@RequestBody Home home) {
        homeService.createHome(home);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Home> getWorksById(@PathVariable Long id) {
        Home home = homeService.getHomeById(id);
        return new ResponseEntity<>(home, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Home>> getAllWorks() {
        List<Home> worksList = homeService.getAllHome();
        return new ResponseEntity<>(worksList, HttpStatus.OK);
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Void> deleteWorksById(@PathVariable Long id) {
        homeService.deleteHomeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Void> updateWorks(@PathVariable Long id, @RequestBody Home home) {
        homeService.updateHome(id, home);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
