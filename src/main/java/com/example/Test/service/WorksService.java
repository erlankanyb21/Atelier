package com.example.Test.service;

import com.example.Test.models.Works;
import com.example.Test.repository.WorksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksService {

    private final WorksRepository worksRepository;

    public WorksService(WorksRepository worksRepository) {
        this.worksRepository = worksRepository;
    }

    public Works createWorks(Works works) {
        return worksRepository.save(works);
    }

    public Works getWorksById(Long id) {
        return worksRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Works with id " + id + " does not exist."));
    }

    public List<Works> getAllWorks() {
        return worksRepository.findAll();
    }

    public void deleteWorksById(Long id) {
        worksRepository.deleteById(id);
    }

    public void updateWorks(Long id, Works works) {
        Works worksToUpdate = worksRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Works with id " + id + " does not exist."));

        worksToUpdate.setName(works.getName());
        worksToUpdate.setImgUrl(works.getImgUrl());

        worksRepository.save(worksToUpdate);
    }
}
