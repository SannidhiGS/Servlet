package com.xworkz.dao.impl;

import com.xworkz.dao.FishDAO;
import com.xworkz.dto.FishDTO;

public class FishDAOImpl implements FishDAO {
public FishDAOImpl(){
    System.out.println("The FishDAO implimented");
}
    @Override
    public boolean save(FishDTO fishDTO) {
        return false;
    }
}
