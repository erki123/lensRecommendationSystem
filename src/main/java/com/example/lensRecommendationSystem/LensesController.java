package com.example.lensRecommendationSystem;

import com.example.lensRecommendationSystem.model.Lenses;
import com.example.lensRecommendationSystem.service.LensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LensesController {

    @Autowired
    private LensesService lensesService;

    @GetMapping("/lenses")
    public ResponseEntity<List<Lenses>> getAllLenses() {
        List<Lenses> lenses = lensesService.getAllLenses();
        return ResponseEntity.ok(lenses);
    }
}
