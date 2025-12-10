package com.xworkz.fish.dao.impl;

import com.xworkz.fish.dao.DBConstant;
import com.xworkz.fish.dao.FishDAO;
import com.xworkz.fish.dto.FishDTO;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FishDAOImpl implements FishDAO {

    private static final String SQL =
            "INSERT INTO marine(owner, fish_type, pond_size, quantity, location, phone) VALUES (?, ?, ?, ?, ?, ?)";

    public FishDAOImpl() {
        System.out.println("The FishDAO implemented");
    }

    @Override
    public boolean save(FishDTO fishDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to DB
            try (Connection connection = DriverManager.getConnection(
                    DBConstant.URL.getValue(),
                    DBConstant.USER.getValue(),
                    DBConstant.PASSWORD.getValue())) {

                PreparedStatement ps = connection.prepareStatement(SQL);

                ps.setString(1, fishDTO.getOwner());
                ps.setString(2, fishDTO.getFishType());
                ps.setFloat(3, fishDTO.getPondSize());
                ps.setInt(4, fishDTO.getQuantity());
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
            System.out.println("The duplication checking:");
            ps.setString(1, fishDTO.getOwner());
            ps.setString(2, fishDTO.getPhone());

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int count = rs.getInt(1);
                    System.out.println("Duplicate count = " + count);
                    return count > 0;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @SneakyThrows
    public Optional<FishDTO> findByPhone(String phoneNo) {
        String searchByPhone="select * from marine where phone=?";
        System.out.println("searchByPhone :"+searchByPhone);
        try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(),DBConstant.PASSWORD.getValue());
        PreparedStatement statement=connection.prepareStatement(searchByPhone))
        {
            System.out.println("Executing Statement started...");
            statement.setString(1,phoneNo);
            ResultSet resultSet=statement.executeQuery();
            while(resultSet.next())
            {
                System.out.println("Result row found...");
                int id=resultSet.getInt(1);
                String owner=resultSet.getString(2);
                String fishType=resultSet.getString(3);
                Float pondSize=resultSet.getFloat(4);
                Integer quantity=resultSet.getInt(5);
                String location=resultSet.getString(6);
                String phone=resultSet.getString(7);
                FishDTO fishDTO=new FishDTO(id,owner,fishType,pondSize,quantity,location,phone);
                System.out.println("fishDTO from DB :"+fishDTO);
                return Optional.of(fishDTO);
            }
        }
        System.out.println("Result set no rows found..");

        return FishDAO.super.findByPhone(phoneNo);
    }

    @Override
    @SneakyThrows
    public List<FishDTO> findByLocation(String location) {
        System.out.println("running findByLocation in FishDAO :+"+location);
        String locationSql="select * from marine where location=?";//pre-compiled
        try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue());
        PreparedStatement preparedStatement= connection.prepareStatement(locationSql))
        {
            preparedStatement.setString(1,location);
            ResultSet resultSet= preparedStatement.executeQuery();
List<FishDTO> fishDTOS=new ArrayList<>();
            while(resultSet.next())
            {

                    int id=resultSet.getInt(1);
                    String ownerName=resultSet.getString(2);
                    String fishType= resultSet.getString(3);
                    float pondSize= resultSet.getFloat(4);
                    int quantity= resultSet.getInt(5);
                    String locationFromDb=resultSet.getString(6);
                    String mobile=resultSet.getString(7);
                    FishDTO fishDTO=new FishDTO(id,ownerName,fishType,pondSize,quantity,locationFromDb,mobile);
                fishDTOS.add(fishDTO);
                    System.out.println("fishDTO :"+fishDTO);
            }
            System.out.println("total fishDTOS from DAO after result set:"+fishDTOS.size());
            return  fishDTOS;
        }


    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
