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
    private static final FuelDAO fuelDAO=new FuelDAOImpl();
    public FuelServiceImpl(){
        System.out.println("The fuel service implemented");
    }
    @Override
    public boolean validAndSave(FuelDTO fuelDTO) throws DataInvalidException, DuplicateDataException {
        String barcode= fuelDTO.getBar();
        final boolean isInvalid=isInvalid(fuelDTO,barcode);
        if(isInvalid==true){
            throw new DataInvalidException("The provided data is not valid");
        }
        if(fuelDAO.isDuplicate(fuelDTO)){
            throw new DuplicateDataException("Duplicate data is not allowed");
        }
        boolean saved= fuelDAO.save(fuelDTO);
        System.out.println("The fuel data is :"+saved);
        return saved;
    }

    private static boolean isInvalid(FuelDTO fuelDTO, String barcode){
         String station=fuelDTO.getStation();
         String type=fuelDTO.getType();
         double quantity=fuelDTO.getQuantity();
         double price=fuelDTO.getPrice();
         String bar= fuelDTO.getBar();
         boolean isInValid=false;
         if(station==null || station.length()<3){
             isInValid=true;
         }
         if (type==null || type.isEmpty()){
             isInValid=true;
         }
         if (price==0 ||price>1){
             isInValid=true;
         }
        if (quantity==0 ||price>1){
            isInValid=true;
        }
         if (bar==null|| bar.length()<3){
             isInValid=true;
         }
         return isInValid;
    }
@Override
public Optional<FuelDTO> findByBarcode(SearchDTO searchDTO){
        boolean inValid=false;
         String barcode =searchDTO.getBar();
        if (barcode==null||barcode.length()<2){
            inValid=true;
        }
        if(!inValid){
            System.out.println("Barcode is valid will provide a information");
            Optional<FuelDTO>fuelDTOOptional=this.fuelDAO.findByBarcode(barcode);
            System.out.println("OptionalDTO"+fuelDTOOptional.isPresent());
            return fuelDTOOptional;
        }
    return Optional.empty();
}
}
