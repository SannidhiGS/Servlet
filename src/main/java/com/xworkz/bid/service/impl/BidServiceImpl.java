package com.xworkz.bid.service.impl;

import com.xworkz.bid.dao.BidDAO;
import com.xworkz.bid.dao.PlayerDAO;
import com.xworkz.bid.dao.TeamDAO;
import com.xworkz.bid.dao.impl.BidDAOImpl;
import com.xworkz.bid.dao.impl.PlayerDAOImpl;
import com.xworkz.bid.dao.impl.TeamDAOImpl;
import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.exception.DataDuplicationException;
import com.xworkz.bid.exception.DataInvalidException;
import com.xworkz.bid.service.BidService;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class BidServiceImpl implements BidService {
    public BidServiceImpl(){
        System.out.println("The BidImpl constructor created ");
    }
    BidDAO bidDAO=new BidDAOImpl();
    PlayerDAO playerDAO=new PlayerDAOImpl();
    TeamDAO teamDAO=new TeamDAOImpl();

    @Override
    public boolean validAndSave(BidDTO bidDTO) throws DataInvalidException, SQLException, ClassNotFoundException, DataDuplicationException {
        System.out.println("Validation checking.......");
        boolean isInvalid=false;
        if(bidDTO.getName().length()==0){
           isInvalid =true;
        }
        if(bidDTO.getAge()==0){
            isInvalid=true;
        }
        if(bidDTO.getPlayerType().length()==0){
            isInvalid=true;
        }
        if(bidDTO.getState().length()==0){
            isInvalid=true;
        }
//        if(bidDTO.getBattingAvg()==0){
//            isInvalid=true;
//        }
//        if (bidDTO.getBowlingAvg()==0){
//            isInvalid=true;
//        }
//        if (bidDTO.getNumOfStumps()==0){
//            isInvalid=true;
//        }
        if (isInvalid){
            throw new DataInvalidException("Your data is not valid");
        }
        if (bidDAO.isDuplicate(bidDTO)){
            throw new DataDuplicationException("Your data is duplicate");
        }
        boolean saved= bidDAO.save(bidDTO);
        return saved;
    }

    @Override
    public List<BidDTO> validateEmailAndGetPlayers(String email) throws ClassNotFoundException, SQLException {
        if (!teamDAO.existsByEmail(email)) {
            throw new IllegalArgumentException("Invalid email");
        }
        return playerDAO.findAllPlayers();
    }
}
