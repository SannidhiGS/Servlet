package com.xworkz.fish.service.impl;

import com.xworkz.fish.dao.FishDAO;
import com.xworkz.fish.dao.impl.FishDAOImpl;
import com.xworkz.fish.dto.FishDTO;
import com.xworkz.fish.dto.SearchDTO;
import com.xworkz.fish.exception.DataDuplicateExecption;
import com.xworkz.fish.exception.DataInvalidException;
import com.xworkz.fish.service.FishService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FishServiceImpl implements FishService {
    private final FishDAO fishDAO=new FishDAOImpl();
    public FishServiceImpl(){
        System.out.println("The fish service implimented");
    }
    @Override
    public boolean validAndSave(FishDTO fishDTO) throws DataInvalidException,DataDuplicateExecption {
         String owner=fishDTO.getOwner();
         String fishType=fishDTO.getFishType();
        final boolean inValid = isInValid(fishDTO, owner, fishType);

        if(inValid==true){
            throw new DataInvalidException("The provided data is not valid");
        }
        if (fishDAO.isDuplicate(fishDTO)){
            throw new DataDuplicateExecption("Duplicate entry: this owner and phone number already exist.");
        }
        boolean saved = fishDAO.save(fishDTO);
        System.out.println("The data is saved: " + saved);
        return saved;
    }

    private static boolean isInValid(FishDTO fishDTO, String owner, String fishType) {
        Float pondSize= fishDTO.getPondSize();
        Integer quantity= fishDTO.getQuantity();
        String location= fishDTO.getLocation();
        String phone= fishDTO.getPhone();

        boolean inValid=false;
        if (owner ==null || owner.length()<3){
            inValid=true;
        } else if (fishType ==null || fishType.length()<3) {
            inValid=true;
        }
        else if(pondSize==0){
            inValid=true;
        } else if (quantity==0) {
            inValid=true;
        } else if (location==null || location.length()<3) {
            inValid=true;
        }
        else if(phone==null || phone.length()<10){
            inValid=true;
        }
        return inValid;
    }

    @Override
    public Optional<FishDTO> findByPhone(SearchDTO searchDTO) {

        String phone=searchDTO.getMobileNo();
        boolean invalid=false;
        if(phone==null || phone.length()<10)
        {
            System.err.println("phone is invalid");
            invalid=true;
        }
        if(!invalid)
        {
            System.out.println("phone is valid, will call dao...");
            Optional<FishDTO> optionalFishDTO= this.fishDAO.findByPhone(phone);
            System.out.println("optionalFishDTO :"+optionalFishDTO.isPresent());
            return  optionalFishDTO;
        }
        return FishService.super.findByPhone(searchDTO);
    }

    @Override
    public List<FishDTO> findByLocation(SearchDTO searchDTO) {
        System.out.println("running findByLocation : "+searchDTO);
        String location=searchDTO.getLocation();
        if(location !=null && location.length()>=3)
        {
            System.out.println("location is valid");
           List<FishDTO> fishDTOS= this.fishDAO.findByLocation(location);
            System.out.println("total fish from dao"+fishDTOS.size());
            return  fishDTOS;
        }
        System.err.println("location is invalid");
        return Collections.emptyList();
    }
}
