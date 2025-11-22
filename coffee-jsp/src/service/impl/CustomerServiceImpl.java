package service.impl;

import dto.CoffeeLandDTO;
import dto.CustomerDTO;
import exception.DataInvalidException;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void validAndSave(CustomerDTO customerDTO) throws DataInvalidException {
        System.out.println("The customer service implemented");
        String name=customerDTO.getName();
         long mobile=customerDTO.getMobile();
        String type=customerDTO.getType();
        int quantity=customerDTO.getQuantity();
         String payment=customerDTO.getPayment();

         boolean inValid=false;

         if(name==null || name.length()<3){
             inValid=true;
         }
         else if (mobile==0){
             inValid=true;
         }
         else if(type==null){
             inValid=true;
         }
         else if(quantity==0){
             inValid=true;
         }
         else if(payment==null){
             inValid=true;
         }
         if(true){
             throw new DataInvalidException("The data is invalid");
         }

    }
}
