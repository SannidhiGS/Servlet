package com.xworkz.cattle.dao;

import com.xworkz.cattle.dto.CattleDTO;

import java.util.Optional;

public interface CattleDAO {
    boolean save(CattleDTO cattleDTO);
    boolean checkDuplicate(String owner, Long phone);
    default Optional<CattleDTO> findByPhone(String phoneNo)
    {
        return Optional.empty();
    }
}

