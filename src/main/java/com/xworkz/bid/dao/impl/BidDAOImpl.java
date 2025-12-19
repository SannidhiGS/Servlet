package com.xworkz.bid.dao.impl;

import com.xworkz.bid.dao.BidDAO;
import com.xworkz.bid.dto.BidDTO;
import com.xworkz.bid.exception.DataDuplicationException;

import java.sql.*;

public class BidDAOImpl implements BidDAO {
    public BidDAOImpl(){
        System.out.println("The BidImpl constructor created");
    }
    String sql="INSERT INTO player(name, age, player_type, state, batting_avg, bowling_avg, no_of_stumps)VALUES (?, ?, ?, ?, ?, ?, ?)";
    @Override
    public boolean save(BidDTO bidDTO) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(),DBConstant.PASSWORD.getValue())){
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1, bidDTO.getName());
            preparedStatement.setInt(2,bidDTO.getAge());
            preparedStatement.setString(3, bidDTO.getPlayerType());
            preparedStatement.setString(4, bidDTO.getState());
            preparedStatement.setDouble(5,bidDTO.getBattingAvg());
            preparedStatement.setDouble(6,bidDTO.getBowlingAvg());
            preparedStatement.setInt(7,bidDTO.getNumOfStumps());

            int row= preparedStatement.executeUpdate();
            System.out.println("The number of rows updated "+row);
            return  row>0;
        }
    }

    @Override
    public boolean isDuplicate(BidDTO bidDTO) throws DataDuplicationException, ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String query="Select * from player where name=?";
        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getValue(),
                DBConstant.USER.getValue(),
                DBConstant.PASSWORD.getValue());
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, bidDTO.getName());
            ResultSet resultSet= ps.executeQuery();

            while (resultSet.next()){
                int count= resultSet.getInt(1);
                System.out.println("The duplicate count "+count);
                return count>0;
            }
        }
        return false;
    }
}
