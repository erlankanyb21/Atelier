package com.example.Test.controllers;

import com.example.Test.models.Works;
import com.example.Test.service.WorksService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping("v1/atelier/works")
public class WorksController {

    private final WorksService worksService;

    public WorksController(WorksService worksService) {
        this.worksService = worksService;
    }

    @PostMapping(path = "/item")
    public ResponseEntity<Void> createWorks(@RequestBody Works works) {
        worksService.createWorks(works);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Works> getWorksById(@PathVariable Long id) {
        Works works = worksService.getWorksById(id);
        return new ResponseEntity<>(works, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Works>> getAllWorks() {
        List<Works> worksList = worksService.getAllWorks();
        return new ResponseEntity<>(worksList, HttpStatus.OK);
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Void> deleteWorksById(@PathVariable Long id) {
        worksService.deleteWorksById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<Void> updateWorks(@PathVariable Long id, @RequestBody Works works) {
        worksService.updateWorks(id, works);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
