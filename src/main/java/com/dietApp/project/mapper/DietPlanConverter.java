package com.dietApp.project.mapper;

import com.dietApp.project.model.DietPlan;
import com.dietApp.project.view.DietPlanView;
import org.springframework.stereotype.Component;

@Component
public class DietPlanConverter implements DietPlanMapper{

    @Override
    public DietPlanView dietPlanToDietPlanView(DietPlan dietPlan) {
        if(dietPlan == null) {

            return null;
        }

        DietPlanView dietPlanView = new DietPlanView();
        dietPlanView.setDietaryRquirment(dietPlan.getDietaryRequirment());
        dietPlanView.setFitnessGoal(dietPlan.getFitnessGoal());
        dietPlanView.setMonthlyBudget(dietPlan.getMonthlyBudget());
        return dietPlanView;

    }
}
