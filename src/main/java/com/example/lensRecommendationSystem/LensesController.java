package com.example.lensRecommendationSystem;

import com.example.lensRecommendationSystem.model.Lenses;
import com.example.lensRecommendationSystem.service.LensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class LensesController {

    @Autowired
    private LensesService lensesService;

    @GetMapping("/lenses")
    public ResponseEntity<List<Lenses>> getAllLenses() {
        List<Lenses> lenses = lensesService.getAllLenses();
        return ResponseEntity.ok(lenses);
    }

    @GetMapping("/lenses/sorted")
    public ResponseEntity<List<Lenses>> getLensesSortedByPrice(@RequestParam String order) {
        List<Lenses> lenses = lensesService.getLensesSortedByPrice(order);
        return ResponseEntity.ok(lenses);
    }
    @GetMapping("/lenses/filter")
    public ResponseEntity<List<Lenses>> getLensesByMount(@RequestParam String mount) {
        List<Lenses> lenses = lensesService.getLensesByMount(mount);
        return ResponseEntity.ok(lenses);
    }

    @GetMapping("/lenses/filter/sorted")
    public ResponseEntity<List<Lenses>> getLensesByMountAndSortedByPrice(@RequestParam String mount, @RequestParam String order) {
        List<Lenses> lenses = lensesService.getLensesByMountAndSortedByPrice(mount, order);
        return ResponseEntity.ok(lenses);
    }

}
