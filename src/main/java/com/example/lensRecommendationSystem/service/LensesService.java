package com.example.lensRecommendationSystem.service;

import com.example.lensRecommendationSystem.model.Lenses;
import com.example.lensRecommendationSystem.repo.LensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LensesService {

    @Autowired
    private LensesRepository lensesRepository;

    public List<Lenses> getAllLenses() {
        return lensesRepository.findAll();
    }
}
