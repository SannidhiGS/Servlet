package com.xworkz.fuel.service.impl;

import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dao.impl.FuelDAOImpl;
import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.dto.SearchDTO;
import com.xworkz.fuel.exception.DataInvalidException;
import com.xworkz.fuel.exception.DuplicateDataException;
import com.xworkz.fuel.service.FuelService;

import java.util.Optional;

public class FuelServiceImpl implements FuelService {
FuelDAO fuelDAO=new FuelDAOImpl();
    @Override
    public boolean validAndSave(FuelDTO fuelDTO) throws DataInvalidException, DuplicateDataException {
        final boolean inValid=isInValid(fuelDTO);
        if(inValid==true){
            throw new DataInvalidException("Data invalid execption");
        }
        System.out.println("Checking the duplicate");
        if(fuelDAO.isDuplicate(fuelDTO)){
            throw new DuplicateDataException("The entered data is duplicate");
        }
        boolean saved= fuelDAO.save(fuelDTO);
        System.out.println("Your data is saved: "+saved);
        return saved;
    }

    public boolean isInValid(FuelDTO fuelDTO){
         String name=fuelDTO.getName();
         String location= fuelDTO.getLocation();
         String barcode= fuelDTO.getBarcode();
         String fuelType= fuelDTO.getFuelType();
         boolean inValid=false;
        if(name==null || name.length()<3){
             inValid=true;
         }
        else if (location==null || location.length()<3){
             inValid=true;
         }
        else if(barcode==null || barcode.length()<5){
             inValid=true;
         }
        else if (fuelType==null || fuelType.length()<3){
             inValid=true;
         }
        return inValid;
    }
    @Override
    public Optional<FuelDTO> findByBarcode(SearchDTO searchDTO) {
        String barcode=searchDTO.getBarcode();
        boolean invalid=false;
        if(barcode==null || barcode.length()<8)
        {
            System.err.println("barcode is invalid");
            invalid=true;
        }
        if(!invalid)
        {
            System.out.println("phone is valid, will call dao...");
            Optional<FuelDTO> optionalFuelDTO= this.fuelDAO.findByBarcode(barcode);
            System.out.println("optionalFishDTO :"+optionalFuelDTO.isPresent());
            return  optionalFuelDTO;
        }
        return FuelService.super.findByBarcode(searchDTO);
    }
}
