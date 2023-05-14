package com.example.Test.service;

import com.example.Test.models.Services;
import com.example.Test.repository.ServicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesService {

    private final ServicesRepository servicesRepository;

    public ServicesService(ServicesRepository servicesRepository) {
        this.servicesRepository = servicesRepository;
    }

    public Services createServices(Services services) {
        return servicesRepository.save(services);
    }

    public Services getServicesById(Long id) {
        return servicesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Services with id " + id + " does not exist."));
    }

    public List<Services> getAllServices() {
        return servicesRepository.findAll();
    }

    public void deleteServicesById(Long id) {
        servicesRepository.deleteById(id);
    }

    public void updateServices(Long id, Services services) {
        Services servicesToUpdate = servicesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Services with id " + id + " does not exist."));

        servicesToUpdate.setImage(services.getImage());
        servicesToUpdate.setTitle(services.getTitle());
        servicesToUpdate.setDescription(services.getDescription());

        servicesRepository.save(servicesToUpdate);
    }
}
