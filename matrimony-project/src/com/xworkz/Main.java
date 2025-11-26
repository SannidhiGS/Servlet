package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws SQLException {



        String url="jdbc:mysql://localhost:3306/matrimony_db";
        String username="root";
        String password = "Sannidhi@123";

        try {
            Connection con =DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful!");
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}