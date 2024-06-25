package com.example.lensRecommendationSystem.service;

import com.example.lensRecommendationSystem.model.Lenses;
import com.example.lensRecommendationSystem.repo.LensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LensesService {

    @Autowired
    private LensesRepository lensesRepository;

    public List<Lenses> getAllLenses() {
        return lensesRepository.findAll(Sort.by(Sort.Direction.DESC, "releaseDate"));
    }

    public List<Lenses> getLensesSortedByPrice(String order) {
        Sort sort = order.equalsIgnoreCase("asc") ? Sort.by("lensPrice").ascending() : Sort.by("lensPrice").descending();
        return lensesRepository.findAll(sort);
    }

    public List<Lenses> getLensesByMount(String mount) {
        return lensesRepository.findByLensMount(mount, Sort.by(Sort.Direction.DESC, "releaseDate"));
    }

    public List<Lenses> getLensesByMountAndSortedByPrice(String mount, String order) {
        Sort sort = order.equalsIgnoreCase("asc") ? Sort.by("lensPrice").ascending() : Sort.by("lensPrice").descending();
        return lensesRepository.findByLensMount(mount, sort);
    }
}
