package com.dietApp.project.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document("diet-plan")
public class DietPlan {
    @Id
    private String Id;
    private String fitnessGoal;
    private Double monthlyBudget;
    private String dietaryRequirment;
    private Meal meal;

    private String dietPlanId;


}
