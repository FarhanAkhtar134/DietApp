package com.dietApp.project.services;

import com.dietApp.project.model.DietPlan;

import java.util.Optional;

public interface DetailService {
   Optional<DietPlan> findByDietPlanId(String id);

}
