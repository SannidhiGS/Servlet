package com.xworkz.dao;

import com.xworkz.dto.FishDTO;
public interface FishDAO {
    boolean save(FishDTO fishDTO);
    boolean isDuplicate(FishDTO fishDTO);
}
