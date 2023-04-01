package com.dietApp.project.controller;


import com.dietApp.project.model.DietPlan;
import com.dietApp.project.services.DetailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/detail")
@AllArgsConstructor
public class DetailController {

    private DetailService detailService;

    @GetMapping("/{id}")
    public DietPlan getDietPlanById(@PathVariable String id){

        System.out.println("Value is : "+ id);


//        return detailService.findOne(id).orElseThrow(NullPointerException::new);
        return detailService.findByDietPlanId(id).orElseThrow(NullPointerException::new);
//        return detailService.findByMonthlyBudget(3500d).orElseThrow(NullPointerException::new);



    }

}
