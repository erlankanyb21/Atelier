package com.example.Test.service;

import com.example.Test.models.Project;
import com.example.Test.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    public final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Project> list() {
        return orderRepository.findAll();
    }

    public void add(Project project) {
//        if (orderRepository.findUserByEmail(project.getEmail()).isPresent()){
//            throw new RestApiException("this email is already taken!");
//        }
        orderRepository.save(project);
    }

    public void delete(Long projectId) {
        orderRepository.deleteById(projectId);
    }

    public void update(Project project) {
        Optional<Project> row = orderRepository.findById(project.getId());
        if (row.isPresent()) {
            Project item = row.get();
            if (!project.getName().isEmpty()){
                item.setName(project.getName());
            }
            if (!project.getPhoneNumber().isEmpty()){
                item.setPhoneNumber(project.getPhoneNumber());
            }
            if (!project.getEmail().isEmpty()){
                item.setEmail(project.getEmail());
            }
            if (!project.getDescription().isEmpty()){
                item.setDescription(project.getDescription());
            }
            if (!project.getBudget().isEmpty()){
                item.setBudget(project.getBudget());
            }
            if (project.getDeadline() != null){
                item.setDeadline(project.getDeadline());
            }
            orderRepository.save(item);
        }
    }
}
