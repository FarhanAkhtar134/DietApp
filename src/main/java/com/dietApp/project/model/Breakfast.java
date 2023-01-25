package com.dietApp.project.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Breakfast {
    private List<Recipie> recipies;

}
