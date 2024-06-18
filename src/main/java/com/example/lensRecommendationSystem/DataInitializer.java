package com.example.lensRecommendationSystem;

import com.example.lensRecommendationSystem.model.Lenses;
import com.example.lensRecommendationSystem.repo.LensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private LensesRepository lensesRepository;

    @Override
    public void run(String... args) throws Exception {
        // Sample data
        Lenses lens1 = new Lenses("Canon EF 50mm f/1.8 STM", "link1", 125.0, 4.5, 50.0, 50.0, 1.8, "Yes", "Canon", "EF", "Prime", "Portrait");
        Lenses lens2 = new Lenses("Nikon AF-S DX NIKKOR 35mm f/1.8G", "link2", 195.0, 4.7, 35.0, 35.0, 1.8, "No", "Nikon", "F", "Prime", "Street");
        Lenses lens3 = new Lenses("Sony FE 24-70mm f/2.8 GM", "link3", 2198.0, 4.9, 24.0, 70.0, 2.8, "Yes", "Sony", "E", "Zoom", "Landscape");
        Lenses lens4 = new Lenses("Canon RF 24-105mm f/4L IS USM", "link4", 1099.0, 4.6, 24.0, 105.0, 4.0, "Yes", "Canon", "RF", "Zoom", "Events");
        Lenses lens5 = new Lenses("Sigma 18-35mm f/1.8 DC HSM Art", "link5", 799.0, 4.8, 18.0, 35.0, 1.8, "No", "Sigma", "EF", "Zoom", "Nature");

        lensesRepository.saveAll(Arrays.asList(lens1, lens2, lens3, lens4, lens5));
    }
}
