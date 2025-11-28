package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StreetMain {
    public static void main(String[] args)throws SQLException {
        String url = "jdbc:mysql://localhost:3306/street_db";
        String user = "root";
        String password = "Sannidhi@123";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            System.out.println("Connection successful");


            String sqlInsert="INSERT INTO streets " +
                    "(street_id, street_name, city, length, type, is_busy, lanes, has_sidewalk, has_lights, traffic_signals, parking_available, cleaning_frequency, neighborhood, governing_body) VALUES " +
                    "(1, 'MG Road', 'Bangalore', 2.5, 'Commercial', TRUE, 4, TRUE, TRUE, 5, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(2, 'Brigade Road', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(3, 'Residency Road', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(4, 'Jayanagar 4th Block', 'Bangalore', 3.0, 'Residential', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'South', 'BBMP')," +
                    "(5, 'Koramangala 5th Block', 'Bangalore', 2.2, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'East', 'BBMP')," +
                    "(6, 'Church Street', 'Bangalore', 1.5, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(7, 'Commercial Street', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(8, 'Residency Road 2', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(9, 'Vittal Mallya Road', 'Bangalore', 2.3, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(10, 'Lavelle Road', 'Bangalore', 1.9, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(11, 'Infantry Road', 'Bangalore', 2.1, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(12, 'Sampige Road', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'West', 'BBMP')," +
                    "(13, 'Chickpet Road', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(14, 'Commercial Street 2', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(15, 'Church Street 2', 'Bangalore', 1.6, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(16, 'MG Road 2', 'Bangalore', 2.5, 'Commercial', TRUE, 4, TRUE, TRUE, 5, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(17, 'Brigade Road 2', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(18, 'Residency Road 3', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(19, 'Jayanagar 5th Block', 'Bangalore', 3.1, 'Residential', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'South', 'BBMP')," +
                    "(20, 'Koramangala 6th Block', 'Bangalore', 2.3, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'East', 'BBMP')," +
                    "(21, 'Church Street 3', 'Bangalore', 1.5, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(22, 'Commercial Street 3', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(23, 'Residency Road 4', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(24, 'Vittal Mallya Road 2', 'Bangalore', 2.3, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(25, 'Lavelle Road 2', 'Bangalore', 1.9, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(26, 'Infantry Road 2', 'Bangalore', 2.1, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(27, 'Sampige Road 2', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'West', 'BBMP')," +
                    "(28, 'Chickpet Road 2', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(29, 'Commercial Street 4', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(30, 'Church Street 4', 'Bangalore', 1.6, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(31, 'MG Road 3', 'Bangalore', 2.5, 'Commercial', TRUE, 4, TRUE, TRUE, 5, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(32, 'Brigade Road 3', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(33, 'Residency Road 5', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(34, 'Jayanagar 6th Block', 'Bangalore', 3.0, 'Residential', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'South', 'BBMP')," +
                    "(35, 'Koramangala 7th Block', 'Bangalore', 2.2, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'East', 'BBMP')," +
                    "(36, 'Church Street 5', 'Bangalore', 1.5, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(37, 'Commercial Street 5', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(38, 'Residency Road 6', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(39, 'Vittal Mallya Road 3', 'Bangalore', 2.3, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(40, 'Lavelle Road 3', 'Bangalore', 1.9, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(41, 'Infantry Road 3', 'Bangalore', 2.1, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(42, 'Sampige Road 3', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'West', 'BBMP')," +
                    "(43, 'Chickpet Road 3', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(44, 'Commercial Street 6', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(45, 'Church Street 6', 'Bangalore', 1.6, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(46, 'MG Road 4', 'Bangalore', 2.5, 'Commercial', TRUE, 4, TRUE, TRUE, 5, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(47, 'Brigade Road 4', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(48, 'Residency Road 7', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(49, 'Jayanagar 7th Block', 'Bangalore', 3.0, 'Residential', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'South', 'BBMP')," +
                    "(50, 'Koramangala 8th Block', 'Bangalore', 2.2, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'East', 'BBMP')," +
                    "(51, 'Church Street 7', 'Bangalore', 1.5, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(52, 'Commercial Street 7', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(53, 'Residency Road 8', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(54, 'Vittal Mallya Road 4', 'Bangalore', 2.3, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(55, 'Lavelle Road 4', 'Bangalore', 1.9, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(56, 'Infantry Road 4', 'Bangalore', 2.1, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(57, 'Sampige Road 4', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'West', 'BBMP')," +
                    "(58, 'Chickpet Road 4', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(59, 'Commercial Street 8', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(60, 'Church Street 8', 'Bangalore', 1.6, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(61, 'MG Road 5', 'Bangalore', 2.5, 'Commercial', TRUE, 4, TRUE, TRUE, 5, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(62, 'Brigade Road 5', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(63, 'Residency Road 9', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(64, 'Jayanagar 8th Block', 'Bangalore', 3.0, 'Residential', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'South', 'BBMP')," +
                    "(65, 'Koramangala 9th Block', 'Bangalore', 2.2, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'East', 'BBMP')," +
                    "(66, 'Church Street 9', 'Bangalore', 1.5, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(67, 'Commercial Street 9', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(68, 'Residency Road 10', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(69, 'Vittal Mallya Road 5', 'Bangalore', 2.3, 'Commercial', TRUE, 3, TRUE, TRUE, 4, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(70, 'Lavelle Road 5', 'Bangalore', 1.9, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(71, 'Infantry Road 5', 'Bangalore', 2.1, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'Central', 'BBMP')," +
                    "(72, 'Sampige Road 5', 'Bangalore', 2.0, 'Residential', FALSE, 2, TRUE, TRUE, 2, TRUE, 'Weekly', 'West', 'BBMP')," +
                    "(73, 'Chickpet Road 5', 'Bangalore', 1.8, 'Commercial', TRUE, 3, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(74, 'Commercial Street 10', 'Bangalore', 1.7, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')," +
                    "(75, 'Church Street 10', 'Bangalore', 1.6, 'Commercial', TRUE, 2, TRUE, TRUE, 3, TRUE, 'Daily', 'Central', 'BBMP')";

           // int rowsInserted = statement.executeUpdate(sqlInsert);
            //System.out.println("Rows inserted: " + rowsInserted);


            System.out.println("Updating 4 columns:");
            System.out.println(statement.executeUpdate("UPDATE street SET street_name='MG Road Updated' WHERE street_id=1"));
            System.out.println(statement.executeUpdate("UPDATE street SET city='New Bangalore' WHERE street_id=2"));
            System.out.println(statement.executeUpdate("UPDATE street SET length=6.5 WHERE street_id=3"));
            System.out.println(statement.executeUpdate("UPDATE street SET type='Vehicular' WHERE street_id=4"));


            System.out.println("Delete by PK:");
            int deleteById = statement.executeUpdate("DELETE FROM street WHERE street_id=5");
            System.out.println("Rows deleted by PK: " + deleteById);

            System.out.println("Delete multiple by city:");
            int deleteByCity = statement.executeUpdate("DELETE FROM street WHERE city='Bangalore'");
            System.out.println("Rows deleted by city: " + deleteByCity);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
