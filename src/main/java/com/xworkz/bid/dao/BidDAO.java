package com.xworkz.bid.dao;

import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.exception.DataDuplicationException;

import java.sql.SQLException;

public interface BidDAO {
    boolean save(BidDTO bidDTO) throws ClassNotFoundException, SQLException;
    boolean isDuplicate(BidDTO bidDTO) throws DataDuplicationException, ClassNotFoundException, SQLException;
    void saveBid(String playerName, String teamEmail, double bidAmount)
            throws SQLException, ClassNotFoundException;

    int getBidCountForPlayer(String playerName)
            throws SQLException, ClassNotFoundException;

    BidDTO getHighestBid(String playerName)
            throws SQLException, ClassNotFoundException;

    void allocatePlayer(String playerName, String teamEmail)
            throws SQLException, ClassNotFoundException;

    boolean isPlayerAllocated(String playerName) throws SQLException, ClassNotFoundException;
}
