package service;

import dto.CoffeeDTO;


public interface CoffeeService {
    void validateAndSave(CoffeeDTO coffeeDTO);
}
