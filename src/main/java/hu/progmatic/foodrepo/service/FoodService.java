package hu.progmatic.foodrepo.service;

import hu.progmatic.foodrepo.model.Food;
import hu.progmatic.foodrepo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }

    public Food findById(Long id){
        return foodRepository.findById(id).orElse(null);
    }
    public Food createFood(Food food){
        return foodRepository.save(food);
    }

}
