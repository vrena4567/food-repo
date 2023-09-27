package hu.progmatic.foodrepo.controller;

import hu.progmatic.foodrepo.model.Food;
import hu.progmatic.foodrepo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
    @GetMapping
    public List<Food> getAllFoodPage(){
        return foodService.getAllFood();
    }
    @GetMapping("/{id}")
    public Food findByIdPage(@PathVariable Long id){
        return foodService.findById(id);
    }

    @PostMapping
    public Food createFoodPage(@RequestBody Food food){
    return foodService.createFood(food);
    }
}
