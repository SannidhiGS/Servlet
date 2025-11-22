package service;

import dto.CoffeeLandDTO;
import dto.CustomerDTO;
import exception.DataInvalidException;

public interface CustomerService {
    public void validAndSave(CustomerDTO customerDTO) throws DataInvalidException;
}
