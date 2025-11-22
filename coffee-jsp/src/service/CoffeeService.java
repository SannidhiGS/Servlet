package service;

import dto.CoffeeDTO;
import exception.DataInvalidException;

import javax.xml.bind.DataBindingException;


public interface CoffeeService {
    void validateAndSave(CoffeeDTO coffeeDTO) throws DataInvalidException;
}
