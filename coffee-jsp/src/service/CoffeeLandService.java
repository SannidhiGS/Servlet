package service;

import com.xworkz.coffee.CoffeeLandServlet;
import dto.CoffeeLandDTO;
import exception.DataInvalidException;

public interface CoffeeLandService {
    public void validAndSave(CoffeeLandDTO coffeeLandDTO) throws DataInvalidException;
}
