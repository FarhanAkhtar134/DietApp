package com.dietApp.project.repository;

import com.dietApp.project.model.DietPlan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailRepository extends MongoRepository<DietPlan, String> {

    @Query("{ 'dietPlanId' : ?0 }")
    Optional<DietPlan> findByDietPlanId(String id);


}
