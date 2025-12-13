package com.xworkz.fuel.dao.impl;

import com.xworkz.fuel.dao.DBConstant;
import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dto.FuelDTO;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

public class FuelDAOImpl implements FuelDAO {
    public FuelDAOImpl(){
        System.out.println("The FuelDAOImpl invoked");
    }
    final static String sql = "INSERT INTO fuel_station(name, location, barcode, fuel_type) VALUES (?, ?, ?, ?)";

    @Override
    public boolean save(FuelDTO fuelDTO) {
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())){
                    PreparedStatement preparedStatement=connection.prepareStatement(sql);
                    System.out.println("Passing the value to the prpared statement");
                    preparedStatement.setString(1, fuelDTO.getName());
                    preparedStatement.setString(2, fuelDTO.getLocation());
                    preparedStatement.setString(3, fuelDTO.getBarcode());
                    preparedStatement.setString(4, fuelDTO.getFuelType());
                    int row=preparedStatement.executeUpdate();
                    System.out.println("The number of rows updated "+row);
                     return row>0;
                } catch (SQLException e) {
                    throw new RuntimeException(e);

                }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean isDuplicate(FuelDTO fuelDTO) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String query = "SELECT * FROM fuel_station WHERE barcode = ?";
        try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue());
        PreparedStatement ps= connection.prepareStatement(query)) {
            ps.setString(1, fuelDTO.getBarcode());
           try(ResultSet rs= ps.executeQuery()){
               while (rs.next()){
                   int count= rs.getInt(1);
                   System.out.println("The count value "+count);
                   return count>0;
               }
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    @Override
    @SneakyThrows
    public Optional<FuelDTO> findByBarcode(String barcode){
        String searchByBarcode = "SELECT * FROM fuel_station WHERE barcode = ?";
        System.out.println("searchByBarcode: " + searchByBarcode);

        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getValue(),
                DBConstant.USER.getValue(),
                DBConstant.PASSWORD.getValue());
             PreparedStatement statement = connection.prepareStatement(searchByBarcode)) {

            System.out.println("Executing Statement started...");
            statement.setString(1, barcode);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Result row found...");
                    String name = resultSet.getString("name");
                    String location = resultSet.getString("location");
                    String bar = resultSet.getString("barcode");
                    String fueltype = resultSet.getString("fuel_type");

                    FuelDTO fuelDTO = new FuelDTO();
                    fuelDTO.setName(name);
                    fuelDTO.setLocation(location);
                    fuelDTO.setBarcode(bar);
                    fuelDTO.setFuelType(fueltype);

                    System.out.println("FuelDTO from DB: " + fuelDTO);
                    return Optional.of(fuelDTO);
                }
            }

            System.out.println("Result set no rows found..");
            return Optional.empty();
        }
    }

}
