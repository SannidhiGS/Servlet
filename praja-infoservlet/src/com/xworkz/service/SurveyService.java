package com.xworkz.service;

import com.xworkz.dto.SurveyDTO;
import com.xworkz.exception.DataInvalidException;

public interface SurveyService{
    public void validAndSave(SurveyDTO surveyDTO) throws DataInvalidException;
}
