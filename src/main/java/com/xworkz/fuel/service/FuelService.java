package com.xworkz.fuel.service;

import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.dto.SearchDTO;
import com.xworkz.fuel.exception.DataInvalidException;
import com.xworkz.fuel.exception.DuplicateDataException;

import java.util.Optional;

public interface FuelService {
    boolean validAndSave(FuelDTO fuelDTO) throws DataInvalidException, DuplicateDataException;

    default Optional<FuelDTO> findByBarcode(SearchDTO searchDTO){
        return Optional.empty();
    };
}
