package com.dietApp.project.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DietPlanView {
    private String fitnessGoal;

    private Double monthlyBudget;

    private String dietaryRquirment;


}
