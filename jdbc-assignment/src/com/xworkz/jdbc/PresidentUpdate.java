package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentUpdate {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sannidhi@123";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query1="Update president set country='SPDS where president_id=25";
            String query2="Update president set birth_date='1970-04-03' where president_id=46";
            String query3="Update president set is_incumbent=true where president_id=26";
            String query4="Update president set previous_position='Railway' where president_id=61";

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
