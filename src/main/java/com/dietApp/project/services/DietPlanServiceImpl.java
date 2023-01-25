package com.dietApp.project.services;


import com.dietApp.project.model.DietPlan;
import com.dietApp.project.repository.DietPlanRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DietPlanServiceImpl implements DietPlanService {

    private DietPlanRepository dietPlanRepository;

    @Override
    public List<DietPlan> findAll() {
        return dietPlanRepository.findAll();
    }
}
