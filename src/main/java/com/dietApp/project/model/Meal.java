package com.dietApp.project.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Meal {
    private Breakfast breakfast;
    private Lunch lunch;
    private Dinner dinner;

}
