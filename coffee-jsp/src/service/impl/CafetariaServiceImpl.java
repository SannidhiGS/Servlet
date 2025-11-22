package service.impl;

import dto.CafetariaDTO;
import exception.DataInvalidException;
import service.CafetariaService;

import java.util.zip.DataFormatException;

public class CafetariaServiceImpl implements CafetariaService {


    @Override
    public void validAndSave(CafetariaDTO cafetariaDTO) throws DataInvalidException {
        String name=cafetariaDTO.getName();
        String type=cafetariaDTO.getType();
        String location=cafetariaDTO.getLocation() ;
        float price=cafetariaDTO.getPrice();
        String franch=cafetariaDTO.getFranch();
        String owner= cafetariaDTO.getOwner();
        long gst= cafetariaDTO.getGst();

        boolean inValid=false;
        if(name==null || name.length()<3){
            inValid=true;
        }
        else if(type==null || type.length()<3){
            inValid=true;
        } else if (location==null || location.length()<3) {
            inValid=true;
        } else if (price==0) {
            inValid=true;
        } else if (owner==null || owner.length()<3 ){
            inValid=true;
        }
        else if (franch==null||owner.length()<3){
            inValid=true;
        }
        else if(gst==0||gst<1000000000){
            inValid=true;
        }
        if (inValid){
                throw new DataInvalidException("Data is invalid");
        }
    }
}
