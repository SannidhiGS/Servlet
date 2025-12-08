package com.xworkz.cattle.service;
import com.xworkz.cattle.dto.CattleDTO;
import com.xworkz.cattle.dto.SearchDTO;
import com.xworkz.cattle.exeception.DataInvalidException;
import com.xworkz.cattle.exeception.DuplicateException;

import java.util.Optional;
import java.util.zip.DataFormatException;

public interface CattleService {
    boolean validateAndSave(CattleDTO cattleDTO) throws DataInvalidException, DuplicateException;
    default Optional<CattleDTO> findByOne(CattleDTO cattleDTO){
        return Optional.empty();
    }

    Optional<CattleDTO> findByPhone(SearchDTO searchDTO);
}
