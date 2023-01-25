package com.dietApp.project.mapper;

import com.dietApp.project.model.DietPlan;
import com.dietApp.project.view.DietPlanView;
import org.mapstruct.Mapper;

@Mapper
public interface DietPlanMapper {
    DietPlanView dietPlanToDietPlanView(DietPlan dietPlan);
}
