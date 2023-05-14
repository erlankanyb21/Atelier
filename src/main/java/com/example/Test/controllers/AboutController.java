package com.example.Test.controllers;

import com.example.Test.models.About;
import com.example.Test.service.AboutService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping("v1/atelier/about")
public class AboutController {

    private final AboutService aboutService;

    public AboutController(AboutService aboutService) {
        this.aboutService = aboutService;
    }

    @PostMapping(path = "/item")
    public ResponseEntity<Void> createAbout(@RequestBody About about) {
        aboutService.createAbout(about);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<About> getAboutById(@PathVariable Long id) {
        About about = aboutService.getAboutById(id);
        return new ResponseEntity<>(about, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<About>> getAllAbout() {
        List<About> worksList = aboutService.getAllAbout();
        return new ResponseEntity<>(worksList, HttpStatus.OK);
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Void> deleteAboutById(@PathVariable Long id) {
        aboutService.deleteAboutById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Void> updateAbout(@PathVariable Long id, @RequestBody About about) {
        aboutService.updateAbout(id, about);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
