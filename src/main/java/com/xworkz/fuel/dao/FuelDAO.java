package com.xworkz.fuel.dao;

import com.xworkz.fuel.dto.FuelDTO;

import java.util.Optional;

public interface FuelDAO {
    boolean save(FuelDTO fuelDTO);
    boolean isDuplicate(FuelDTO fuelDTO);
    default Optional<FuelDTO> findByBarcode(String barcode){
        return Optional.empty();
    }
}
