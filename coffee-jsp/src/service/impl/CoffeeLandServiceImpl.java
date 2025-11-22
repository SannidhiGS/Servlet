package service.impl;
import dto.CoffeeLandDTO;
import exception.DataInvalidException;
import service.CoffeeLandService;

public class CoffeeLandServiceImpl implements CoffeeLandService {
    @Override
    public void validAndSave(CoffeeLandDTO coffeeLandDTO) throws DataInvalidException {
        System.out.println("The coffee land service implemented");
         int size=coffeeLandDTO.getSize();
         float total=coffeeLandDTO.getTotal();
         String quantity=coffeeLandDTO.getQuantity();
         float expend=coffeeLandDTO.getExpend();
         float profit=coffeeLandDTO.getProfit();
         String Fert=coffeeLandDTO.getFert();
         boolean inValid=false;
         if(size==0){
             inValid=true;
         } else if (total==0) {
             inValid=true;
         }else if(quantity==null){
             inValid=true;
         }
         else if (expend==0){
             inValid=true;
         } else if (profit==0) {
             inValid=true;
         }
         else if (Fert==null){
             inValid=true;
         }
         if(true) {
            throw new DataInvalidException("The data is not saved correctly");
         }
    }
}
