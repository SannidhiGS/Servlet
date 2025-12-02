package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetUpdate {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sannidhi@123";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query1="Update street set city='British' where street_id=19";
            String query2="Update street set lanes=5 where street_id=24";
            String query3="Update street set traffic_level='high' where street_id=38";
            String query4="Update street set postal_code=54565 where street_id=71";

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
