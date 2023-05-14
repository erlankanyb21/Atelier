package com.example.Test.controllers;

import com.example.Test.models.Project;
import com.example.Test.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RequestMapping(path = "v1/atelier/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/list")
    public List<Project> list() {
        return orderService.list();
    }

    @PostMapping(path = "/item")
    public void add(@RequestBody Project project) {
        orderService.add(project);
    }

    @DeleteMapping(path = "/item/{projectId}")
    public void delete(@PathVariable Long projectId) {
        orderService.delete(projectId);
    }

    @PutMapping(path = "/item")
    public void update(@RequestBody Project project) {
        orderService.update(project);
    }

}
