package com.dietApp.project.repository;

import com.dietApp.project.model.DietPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DietPlanRepository extends MongoRepository<DietPlan, String> {
}
