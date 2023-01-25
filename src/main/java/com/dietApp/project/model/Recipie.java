package com.dietApp.project.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Recipie {
    private String name;
    private List<String> ingredients;
    private NutritionalValue value;

}
