package service.impl;

import dto.CoffeeDTO;
import exception.DataInvalidException;
import service.CoffeeService;

import java.util.zip.DataFormatException;

public class CoffeeServiceImpl implements CoffeeService {
    @Override
    public void validateAndSave(CoffeeDTO coffeeDTO) throws DataInvalidException {
        System.out.println("Validation and Saving will be done here");

        String type=coffeeDTO.getType();
         float price=coffeeDTO.getPrice();
        String farmer=coffeeDTO.getFarmer();
         float quantity=coffeeDTO.getQuantity();
       String location=coffeeDTO.getLocation();

       boolean inValid=false;
       if(type==null){
           inValid=true;
       }
       else if (price==0){
           inValid=true;
       }
       else if(farmer==null){
           inValid=true;
       }
       else if (quantity==0){
           inValid=true;
       }else if (location==null){
           inValid=true;
       }
       if(true){
           throw new DataInvalidException("The provided data is not valid");
       }
    }
}
