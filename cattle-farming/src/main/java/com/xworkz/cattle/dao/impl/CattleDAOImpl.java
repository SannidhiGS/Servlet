package com.xworkz.cattle.dao.impl;

import com.xworkz.cattle.dao.CattleDAO;
import com.xworkz.cattle.dao.DBConstant;
import com.xworkz.cattle.dto.CattleDTO;

import java.sql.*;

public class CattleDAOImpl implements CattleDAO {
    public CattleDAOImpl(){
        System.out.println("The cattle DAO is created");
    }
    private static final String sql="Insert into cattle(owner,type,age, weight, location,phone) values (?,?,?,?,?,?)";
    @Override
    public boolean save(CattleDTO cattleDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.User.getValue(), DBConstant.Password.getValue())){
                PreparedStatement ps=connection.prepareStatement(sql);
                System.out.println("Getting the data in the cattleDTO");
                ps.setString(1,cattleDTO.getOwner());
                ps.setString(2,cattleDTO.getType());
                ps.setInt(3,cattleDTO.getAge());
                ps.setDouble(4,cattleDTO.getWeight());
                ps.setString(5,cattleDTO.getLocation());
                ps.setLong(6,cattleDTO.getPhone());
                System.out.println("Owner: "+cattleDTO.getOwner());
                System.out.println("Type: "+cattleDTO.getType());
                System.out.println("Age: "+cattleDTO.getAge());
                System.out.println("Weight: "+cattleDTO.getWeight());
                System.out.println("Location: "+cattleDTO.getLocation());
                System.out.println("Phone: "+cattleDTO.getPhone());

                int rows= ps.executeUpdate();
                System.out.println("The number of rows updated");
                return rows>0;
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public boolean checkDuplicate(String owner, Long phone) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection= DriverManager.getConnection(DBConstant.URL.getValue(),DBConstant.User.getValue(), DBConstant.Password.getValue())){
                String query="Select * from cattle where owner=? and phone=?";
                PreparedStatement ps1=connection.prepareStatement(query);
                ps1.setString(1,owner);
                ps1.setLong(2,phone);
                ResultSet rs = ps1.executeQuery();
                return rs.next();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
