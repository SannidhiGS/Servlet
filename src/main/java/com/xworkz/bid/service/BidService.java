package com.xworkz.bid.service;

import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.exception.DataDuplicationException;
import com.xworkz.bid.exception.DataInvalidException;

import java.sql.SQLException;
import java.util.List;

public interface BidService {
    boolean validAndSave(BidDTO bidDTO) throws DataInvalidException, SQLException, ClassNotFoundException, DataDuplicationException;
    List<BidDTO> validateEmailAndGetPlayers(String email) throws SQLException, ClassNotFoundException;
    String placeBid(String playerName, String teamEmail, double bidAmount)
            throws SQLException, ClassNotFoundException;

}
