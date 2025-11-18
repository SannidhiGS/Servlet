package service.impl;

import dto.CoffeeLandDTO;
import dto.CustomerDTO;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void validAndSave(CustomerDTO customerDTO) {
        System.out.println("The customer service implemented");
    }
}
