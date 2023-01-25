package com.dietApp.project.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Dinner {
    private List<Recipie> recipies;
}
