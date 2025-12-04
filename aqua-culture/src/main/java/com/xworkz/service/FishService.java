package com.xworkz.service;

import com.xworkz.dto.FishDTO;
import com.xworkz.exception.DataDuplicateExecption;
import com.xworkz.exception.DataInvalidException;

public interface FishService {
    public boolean validAndSave(FishDTO fishDTO) throws DataInvalidException, DataDuplicateExecption;

}
