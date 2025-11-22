package service;

import dto.CafetariaDTO;
import exception.DataInvalidException;

public interface CafetariaService {
    void validAndSave(CafetariaDTO cafetariaDTO) throws DataInvalidException;
}
