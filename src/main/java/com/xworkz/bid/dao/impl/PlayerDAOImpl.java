package com.xworkz.bid.dao.impl;

import com.xworkz.bid.dao.PlayerDAO;
import com.xworkz.bid.dto.BidDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO {
    @Override
    public List<BidDTO> findAllPlayers() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String sql = "SELECT name, age, player_type, state, batting_avg, bowling_avg, no_of_stumps FROM player";
        try(Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(),DBConstant.PASSWORD.getValue());
        PreparedStatement ps=connection.prepareStatement(sql)){
            ResultSet rs= ps.executeQuery();
            List<BidDTO> players=new ArrayList<>();
            while (rs.next()){
                BidDTO dto = new BidDTO();
                dto.setName(rs.getString("name"));
                dto.setAge(rs.getInt("age"));
                dto.setPlayerType(rs.getString("player_type"));
                dto.setState(rs.getString("state"));
                dto.setBattingAvg(rs.getDouble("batting_avg"));
                dto.setBowlingAvg(rs.getDouble("bowling_avg"));
                dto.setNumOfStumps(rs.getInt("no_of_stumps"));

                players.add(dto);
            }
            return players;
        }
    }
}
