package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentDelete {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sindhu@478";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query1="Delete from president where president_id=26";
            String query2="Delete from president where president_id=43";
            String query3="Delete from president where president_id=9";


            Statement statement=connection.createStatement();
            int rowsAffected1=statement.executeUpdate(query1);
            System.out.println("rowsAffected"+rowsAffected1);
            int rowsAffected2=statement.executeUpdate(query2);
            System.out.println("rowsAffected"+rowsAffected2);
            int rowsAffected3=statement.executeUpdate(query3);
            System.out.println("rowsAffected"+rowsAffected3);

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }
}
