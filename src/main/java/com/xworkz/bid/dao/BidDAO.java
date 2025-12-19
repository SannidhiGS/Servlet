package com.xworkz.bid.dao;

import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.exception.DataDuplicationException;

import java.sql.SQLException;

public interface BidDAO {
    boolean save(BidDTO bidDTO) throws ClassNotFoundException, SQLException;
    boolean isDuplicate(BidDTO bidDTO) throws DataDuplicationException, ClassNotFoundException, SQLException;
}
