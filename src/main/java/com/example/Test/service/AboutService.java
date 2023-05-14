package com.example.Test.service;

import com.example.Test.models.About;
import com.example.Test.repository.AboutRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    private final AboutRepository aboutRepository;

    public AboutService(AboutRepository aboutRepository) {
        this.aboutRepository = aboutRepository;
    }

    public About createAbout(About works) {
        return aboutRepository.save(works);
    }

    public About getAboutById(Long id) {
        return aboutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("AboutUs with id " + id + " does not exist."));
    }

    public List<About> getAllAbout() {
        return aboutRepository.findAll();
    }

    public void deleteAboutById(Long id) {
        aboutRepository.deleteById(id);
    }

    public void updateAbout(Long id, About about) {
        About aboutToUpdate = aboutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("AboutUs with id " + id + " does not exist."));

        aboutToUpdate.setTitle(about.getTitle());
        aboutToUpdate.setImgUrl(about.getImgUrl());
        aboutToUpdate.setDescription(aboutToUpdate.getDescription());

        aboutRepository.save(aboutToUpdate);
    }
}
