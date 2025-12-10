package com.xworkz.fish.dao;

import com.xworkz.fish.dto.FishDTO;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface FishDAO {
    boolean save(FishDTO fishDTO);

    boolean isDuplicate(FishDTO fishDTO);

   default  Optional<FishDTO> findByPhone(String phoneNo)
    {
        return Optional.empty();
    }

    default List<FishDTO> findByLocation(String location)
    {
        return Collections.emptyList();
    }

}
