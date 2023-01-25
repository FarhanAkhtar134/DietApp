package com.dietApp.project.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Lunch {
    private List<Recipie> recipies;
}
