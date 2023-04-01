package com.dietApp.project.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DetailPlanView {
    private String Id;
    private String fitnessGoal;

    private Double monthlyBudget;

    private String dietaryRequirment;

    private String meals;
}
