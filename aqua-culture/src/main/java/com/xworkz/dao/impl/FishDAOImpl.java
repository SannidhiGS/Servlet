package com.xworkz.dao.impl;

import com.xworkz.dao.DBConstant;
import com.xworkz.dao.FishDAO;
import com.xworkz.dto.FishDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FishDAOImpl implements FishDAO {

    private static final String SQL =
            "INSERT INTO marine(owner, fish_type, pond_size, quantity, location, phone) VALUES (?, ?, ?, ?, ?, ?)";

    public FishDAOImpl() {
        System.out.println("The FishDAO implemented");
    }

    @Override
    public boolean save(FishDTO fishDTO) {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            try (Connection connection = DriverManager.getConnection(
                    DBConstant.URL.getValue(),
                    DBConstant.USER.getValue(),
                    DBConstant.PASSWORD.getValue())) {

                PreparedStatement ps = connection.prepareStatement(SQL);

                ps.setString(1, fishDTO.getOwner());
                ps.setString(2, fishDTO.getFishType());
                ps.setString(3, fishDTO.getPondSize());
                ps.setString(4, fishDTO.getQuantity());
                ps.setString(5, fishDTO.getLocation());
                ps.setString(6, fishDTO.getPhone());

                System.out.println("Owner = " + fishDTO.getOwner());
                System.out.println("Fish = " + fishDTO.getFishType());

                int row = ps.executeUpdate();
                System.out.println("Rows updated: " + row);

                return row > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
@Override

public boolean isDuplicate(FishDTO fishDTO) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        return false;
    }

    String query = "SELECT COUNT(*) FROM marine WHERE owner = ? AND phone = ?";
    try (Connection connection = DriverManager.getConnection(
            DBConstant.URL.getValue(),
            DBConstant.USER.getValue(),
            DBConstant.PASSWORD.getValue());
         PreparedStatement ps = connection.prepareStatement(query)) {

        ps.setString(1, fishDTO.getOwner());
        ps.setString(2, fishDTO.getPhone());

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

}
