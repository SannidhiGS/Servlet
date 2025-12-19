package com.xworkz.bid.dao;

import com.xworkz.bid.dto.BidDTO;

import java.sql.SQLException;
import java.util.List;

public interface PlayerDAO {
    List<BidDTO> findAllPlayers() throws SQLException, ClassNotFoundException;
}
