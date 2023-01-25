package com.dietApp.project.controller;


import com.dietApp.project.mapper.DietPlanConverter;
import com.dietApp.project.services.DietPlanService;
import com.dietApp.project.view.DietPlanView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/diet")
@AllArgsConstructor
public class DietPlanController {

    private DietPlanService dietPlanService;
    private DietPlanConverter dietPlanConverter;

    @GetMapping("/list")
    public List<DietPlanView> dietplan() {

        return dietPlanService.findAll().stream().map(dietPlanConverter::dietPlanToDietPlanView).collect(Collectors.toList());
    }
}
