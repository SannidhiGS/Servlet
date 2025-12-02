package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalUpdate {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sannidhi@123";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query1="Update hospital set city='Paris' where hospital_id=11";
            String query2="Update hospital set accreditation='Cannada Health' where hospital_id=37";
            String query3="Update hospital set hospital_type='Ortho' where hospital_id=53";
            String query4="Update hospital set has_emergency=true where hospital_id=47";

            Statement statement=connection.createStatement();
            int rowsAffected1=statement.executeUpdate(query1);
            System.out.println("rowsAffected"+rowsAffected1);
            int rowsAffected2=statement.executeUpdate(query2);
            System.out.println("rowsAffected"+rowsAffected2);
            int rowsAffected3=statement.executeUpdate(query3);
            System.out.println("rowsAffected"+rowsAffected3);
            int rowsAffected4=statement.executeUpdate(query4);
            System.out.println("rowsAffected"+rowsAffected4);
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
