package com.dietApp.project.services;


import com.dietApp.project.model.DietPlan;
import com.dietApp.project.repository.DetailRepository;
import com.dietApp.project.repository.DietPlanRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class DetailServiceImpl implements DetailService {
    private DetailRepository detailRepository;

    @Override
    public Optional<DietPlan> findByDietPlanId(String id) {
        return detailRepository.findByDietPlanId(id);
    }

}
