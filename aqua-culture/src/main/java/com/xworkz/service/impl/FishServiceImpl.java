package com.xworkz.service.impl;

import com.xworkz.dao.FishDAO;
import com.xworkz.dao.impl.FishDAOImpl;
import com.xworkz.dto.FishDTO;
import com.xworkz.exception.DataInvalidException;
import com.xworkz.service.FishService;

public class FishServiceImpl implements FishService {
    private final FishDAO fishDAO=new FishDAOImpl();
    public FishServiceImpl(){
        System.out.println("The fish service implimented");
    }
    @Override
    public void validAndSave(FishDTO fishDTO) throws DataInvalidException {
         String owner=fishDTO.getOwner();
         String fishType=fishDTO.getFishType();
         String pondSize=fishDTO.getPondSize();
         String quantity=fishDTO.getQuantity();
         String location=fishDTO.getLocation();
        String phone=fishDTO.getPhone();

        boolean inValid=false;
        if (owner==null || owner.length()<3){
            inValid=true;
        } else if (fishType==null || fishType.length()<3) {
            inValid=true;
        }
        else if(pondSize==null || pondSize.length()<1){
            inValid=true;
        } else if (quantity==null || quantity.length()<1) {
            inValid=true;
        } else if (location==null || location.length()<3) {
            inValid=true;
        }
        else if(phone==null || phone.length()<10){
            inValid=true;
        }

        if(inValid=true){
            throw new DataInvalidException("The provided data is not valid");
        }
        else {
            boolean save= fishDAO.save(fishDTO);
            System.out.println("The data is saved: "+save);
        }
    }
}
