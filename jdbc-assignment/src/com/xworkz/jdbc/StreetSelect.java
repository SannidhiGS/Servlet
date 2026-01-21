package com.xworkz.jdbc;

import java.sql.*;

public class StreetSelect {

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(
                DBConst.URL.getProperty(),
                DBConst.Username.getProperty(),
                DBConst.Secret.getProperty())
        ) {
            Statement statement = connection.createStatement();

            // Select all rows
            String selectAll = "SELECT * FROM street";
            ResultSet rs1 = statement.executeQuery(selectAll);
            while (rs1.next()) {
                int street_id = rs1.getInt("street_id");
                String street_name = rs1.getString("street_name");
                String city = rs1.getString("city");
                String state = rs1.getString("state");
                String country = rs1.getString("country");
                String postal_code = rs1.getString("postal_code");
                String street_type = rs1.getString("street_type");
                int lanes = rs1.getInt("lanes");
                boolean has_sidewalk = rs1.getBoolean("has_sidewalk");
                int speed_limit = rs1.getInt("speed_limit");
                String traffic_level = rs1.getString("traffic_level");
                boolean is_residential = rs1.getBoolean("is_residential");
                double length_km = rs1.getDouble("length_km");

                System.out.println("Street ID: " + street_id);
                System.out.println("Name: " + street_name);
                System.out.println("Street Type: " + street_type);
                System.out.println("City: " + city);
                System.out.println("State: " + state);
                System.out.println("Country: " + country);
                System.out.println("Postal Code: " + postal_code);
                System.out.println("Lanes: " + lanes);
                System.out.println("Has Sidewalk: " + has_sidewalk);
                System.out.println("Speed Limit: " + speed_limit);
                System.out.println("Traffic Level: " + traffic_level);
                System.out.println("Residential: " + is_residential);
                System.out.println("Length (km): " + length_km);
                System.out.println("---------------------------------------");
            }

            // Select one row
            String row1 = "SELECT * FROM street WHERE street_id = 6";
            ResultSet rs2 = statement.executeQuery(row1);
            while (rs2.next()) {
                System.out.println("Street ID: " + rs2.getInt("street_id"));
                System.out.println("Street Name: " + rs2.getString("street_name"));
                System.out.println("Street Type: " + rs2.getString("street_type"));
            }

            // Select one column, one row
            String col1 = "SELECT street_name FROM street WHERE street_id = 10";
            ResultSet rs3 = statement.executeQuery(col1);
            while (rs3.next()) {
                System.out.println("Street Name: " + rs3.getString("street_name"));
            }

            // Select two rows
            String twoRows = "SELECT * FROM street WHERE street_id = 1 OR street_id = 3";
            ResultSet rs4 = statement.executeQuery(twoRows);
            while (rs4.next()) {
                System.out.println("Street ID: " + rs4.getInt("street_id") +
                        " Name: " + rs4.getString("street_name"));
            }

            // Select three rows
            String threeRows = "SELECT * FROM street WHERE street_id IN (6,10,12)";
            ResultSet rs5 = statement.executeQuery(threeRows);
            while (rs5.next()) {
                System.out.println("Street ID: " + rs5.getInt("street_id"));
            }

            // Select one column all rows
            String colAll = "SELECT street_name FROM street";
            ResultSet rs6 = statement.executeQuery(colAll);
            while (rs6.next()) {
                System.out.println("Street Name: " + rs6.getString("street_name"));
            }

            // Select distinct
            String distinct = "SELECT DISTINCT street_type FROM street";
            ResultSet rs7 = statement.executeQuery(distinct);
            while (rs7.next()) {
                System.out.println("Street Type: " + rs7.getString("street_type"));
            }

            // Count rows
            String count = "SELECT COUNT(*) FROM street";
            ResultSet rs8 = statement.executeQuery(count);
            if (rs8.next()) {
                System.out.println("Total Streets: " + rs8.getInt(1));
            }

            // Latest row
            String latest = "SELECT * FROM street ORDER BY street_id DESC LIMIT 1";
            ResultSet rs9 = statement.executeQuery(latest);
            while (rs9.next()) {
                System.out.println("Latest Street ID: " + rs9.getInt("street_id"));
            }

            // Select 2 max rows
            String max2 = "SELECT * FROM street ORDER BY street_id DESC LIMIT 2";
            ResultSet rs10 = statement.executeQuery(max2);
            while (rs10.next()) {
                System.out.println("Street ID: " + rs10.getInt("street_id"));
            }

            // Select min 5 rows
            String min5 = "SELECT * FROM street ORDER BY street_id ASC LIMIT 5";
            ResultSet rs11 = statement.executeQuery(min5);
            while (rs11.next()) {
                System.out.println("Street ID: " + rs11.getInt("street_id"));
            }

            // Oldest row
            String oldest = "SELECT * FROM street ORDER BY street_id ASC LIMIT 1";
            ResultSet rs12 = statement.executeQuery(oldest);
            while (rs12.next()) {
                System.out.println("Oldest Street ID: " + rs12.getInt("street_id"));
            }

            // All rows sorted DESC
            String desc = "SELECT * FROM street ORDER BY street_id DESC";
            ResultSet rs13 = statement.executeQuery(desc);
            while (rs13.next()) {
                System.out.println("Street ID: " + rs13.getInt("street_id"));
            }

            // Group by
            String grp = "SELECT street_type, COUNT(*) AS total FROM street GROUP BY street_type";
            ResultSet rs14 = statement.executeQuery(grp);
            while (rs14.next()) {
                System.out.println(rs14.getString("street_type") + " = " + rs14.getInt("total"));
            }

            // Group by + having
            String grpHaving = "SELECT street_type, COUNT(*) AS total FROM street GROUP BY street_type HAVING COUNT(*) > 1";
            ResultSet rs15 = statement.executeQuery(grpHaving);
            while (rs15.next()) {
                System.out.println(rs15.getString("street_type") + " = " + rs15.getInt("total"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}