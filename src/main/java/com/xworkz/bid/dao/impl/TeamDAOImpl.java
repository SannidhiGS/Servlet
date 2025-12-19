package com.xworkz.bid.dao.impl;

import com.xworkz.bid.dao.TeamDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.xworkz.bid.dao.impl.DBConstant.URL;
public class TeamDAOImpl implements TeamDAO {

    @Override
    public boolean existsByEmail(String email) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String sql = "SELECT 1 FROM team WHERE email = ?";

        try (Connection connection = DriverManager.getConnection(URL.getValue(), DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue()); PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
