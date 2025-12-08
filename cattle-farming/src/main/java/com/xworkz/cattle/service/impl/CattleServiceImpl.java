package com.xworkz.cattle.service.impl;

import com.xworkz.cattle.dao.CattleDAO;
import com.xworkz.cattle.dao.impl.CattleDAOImpl;
import com.xworkz.cattle.dto.CattleDTO;
import com.xworkz.cattle.dto.SearchDTO;
import com.xworkz.cattle.exeception.DataInvalidException;
import com.xworkz.cattle.exeception.DuplicateException;
import com.xworkz.cattle.service.CattleService;

import java.util.Optional;

public class CattleServiceImpl implements CattleService {
    private final CattleDAO cattleDAO=new CattleDAOImpl();
    public CattleServiceImpl(){
        System.out.println("The CattleServiceImpl ");
    }
    @Override
    public boolean validateAndSave(CattleDTO cattleDTO) throws DataInvalidException, DuplicateException {
        if(cattleDTO.getOwner().isEmpty() || cattleDTO.getType().isEmpty()) return false;
        if(cattleDTO.getAge() <= 0 ||cattleDTO.getWeight() <= 0) return false;
        boolean exists =cattleDAO.checkDuplicate(cattleDTO.getOwner(), cattleDTO.getPhone());
        if(exists) return false;
        return cattleDAO.save(cattleDTO);
    }
    @Override
    public Optional<CattleDTO> findByPhone(SearchDTO searchDTO){
        Long phone=searchDTO.getPhone();
        boolean inValid=false;
        if(phone==0){
            System.err.println("phone is invalid");
            inValid=true;
        }
        if(!inValid){
            System.out.println("Phone is Valid and searching from dao");
            Optional<CattleDTO> optionalCattleDTO=this.cattleDAO.findByPhone(phone);
            System.out.println("The data is present "+cattleDAO.isP);
            return optionalCattleDTO;
        }
        return CattleService.super.findByPhone(searchDTO);
    }
}
