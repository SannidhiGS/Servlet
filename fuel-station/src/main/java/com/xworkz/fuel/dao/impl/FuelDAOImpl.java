package com.xworkz.fuel.dao.impl;

import com.xworkz.fuel.dao.DBConstant;
import com.xworkz.fuel.dao.FuelDAO;
import com.xworkz.fuel.dto.FuelDTO;
import com.xworkz.fuel.service.FuelService;
import com.xworkz.fuel.service.impl.FuelServiceImpl;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.Optional;

import static java.lang.System.*;

public class FuelDAOImpl implements FuelDAO {
    public FuelDAOImpl(){
        out.println("The FuelDAO implemented");
    }
    private static final String sql="Insert into fuel(station,type,quantity,price,barcode)values(?,?,?,?,?)";
    @Override
    public boolean save(FuelDTO fuelDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(), DBConstant.PASSWORD.getValue())){
                PreparedStatement preparedStatement= connection.prepareStatement(sql);
                preparedStatement.setString(1, fuelDTO.getStation());
                preparedStatement.setString(2, fuelDTO.getType());
                preparedStatement.setDouble(3,fuelDTO.getQuantity());
                preparedStatement.setDouble(4,fuelDTO.getPrice());
                preparedStatement.setString(5, fuelDTO.getBar());
                out.println("The details of the fuel station");
                out.println("Owner:"+fuelDTO.getStation());
                out.println("Type:"+fuelDTO.getType());
                out.println("Quantity: "+fuelDTO.getQuantity());
                out.println("Price: "+fuelDTO.getPrice());
                out.println("Barcode:"+fuelDTO.getBar());
                int row=preparedStatement.executeUpdate();
                out.println("The statement updated "+row);
                return row>0;
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        //return false;
    }

    @SneakyThrows
    @Override
    public boolean isDuplicate(FuelDTO fuelDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String query = "SELECT COUNT(*) FROM fuel WHERE barcode=?";
        try (Connection connection = DriverManager.getConnection(
                DBConstant.URL.getValue(),
                DBConstant.USER.getValue(),
                DBConstant.PASSWORD.getValue());
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, fuelDTO.getBar());

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        }
        return false;
    }
    @Override
    public Optional<FuelDTO> findByBarcode(String bar){
        String searchBar="Select * from fuel where barcode=?";
        out.println("searchBar"+searchBar);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection connection=DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.USER.getValue(),DBConstant.PASSWORD.getValue());
                PreparedStatement statement=connection.prepareStatement(searchBar)){
                out.println("Executing the search operation");
                statement.setString(1,bar);
                ResultSet resultSet=statement.executeQuery();
                while (resultSet.next()){
                    out.println("The data founded as below");
                    int id=resultSet.getInt(1);
                    String station = resultSet.getString(2);
                    String type = resultSet.getString(3);
                    double quantity = resultSet.getDouble(4);
                    double price = resultSet.getDouble(5);
                    String barc = resultSet.getString(6);

                    FuelDTO fuelDTO = new FuelDTO(station, type, quantity, price, barc);
                    return Optional.of(fuelDTO);

                }
            }
            //System.out.println("No rows found");
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return FuelDAO.super.findByBarcode(bar);

    }
}
