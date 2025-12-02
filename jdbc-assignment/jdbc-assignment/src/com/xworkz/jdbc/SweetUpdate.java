package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetUpdate {

        public static void main(String[] args) {

            String url="jdbc:mysql://localhost:3306/matrimony1";
            String username="root";
            String secret="Sindhu@478";

            try {
                Connection connection = DriverManager.getConnection(url,username,secret);
                System.out.println("Connection"+connection);

                String query1="Update sweet set category='parlour' where sweet_id=5";
                String query2="Update sweet set sweet_name='Mint Tofee' where sweet_id=8";
                String query3="Update sweet set price=1.80 where sweet_id=58";
                String query4="Update sweet set flavor='Ginger' where sweet_id=22";

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


