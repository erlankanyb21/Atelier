package com.example.Test.service;

import com.example.Test.models.Home;
import com.example.Test.models.Services;
import com.example.Test.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    private final HomeRepository homeRepository;

    public HomeService(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;

    }

    public void createHome(Home home) {
        homeRepository.save(home);
    }

    public Home getHomeById(Long id) {
        return homeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Home with id " + id + " does not exist."));
    }

    public List<Home> getAllHome() {
        return homeRepository.findAll();
    }

    public void deleteHomeById(Long id) {
        homeRepository.deleteById(id);
    }

    public void updateHome(Long id, Home home) {
        Home homeToUpdate = homeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Home with id " + id + " does not exist."));

        homeToUpdate.setCtaTitle(home.getCtaTitle());
        homeToUpdate.setCtaDescription(home.getCtaDescription());
        homeToUpdate.setServicesTitle(home.getServicesTitle());

        homeRepository.save(homeToUpdate);
    }
}
