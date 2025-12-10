package com.xworkz.fish.service;

import com.xworkz.fish.dto.FishDTO;
import com.xworkz.fish.dto.SearchDTO;
import com.xworkz.fish.exception.DataDuplicateExecption;
import com.xworkz.fish.exception.DataInvalidException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface FishService {
     boolean validAndSave(FishDTO fishDTO) throws DataInvalidException, DataDuplicateExecption;

     default Optional<FishDTO> findByPhone(SearchDTO searchDTO)
     {
         return Optional.empty();
     }

   default List<FishDTO> findByLocation(SearchDTO searchDTO){
         return Collections.emptyList();
    }
}
