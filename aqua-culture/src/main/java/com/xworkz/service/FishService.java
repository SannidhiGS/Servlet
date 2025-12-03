package com.xworkz.service;

import com.xworkz.dto.FishDTO;
import com.xworkz.exception.DataInvalidException;

public interface FishService {
    public void validAndSave(FishDTO fishDTO) throws DataInvalidException;
}
