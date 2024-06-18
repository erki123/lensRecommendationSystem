package com.example.lensRecommendationSystem.repo;

import com.example.lensRecommendationSystem.model.Lenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LensesRepository extends JpaRepository<Lenses, Long> {
}
