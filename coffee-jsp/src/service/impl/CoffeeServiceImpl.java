package service.impl;

import dto.CoffeeDTO;
import service.CoffeeService;

public class CoffeeServiceImpl implements CoffeeService {
    @Override
    public void validateAndSave(CoffeeDTO coffeeDTO) {
        System.out.println("Validation and Saving will be done here");
    }
}
