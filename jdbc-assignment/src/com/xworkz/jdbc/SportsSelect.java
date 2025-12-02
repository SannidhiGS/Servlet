package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsSelect {

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(
                DBConst.URL.getProperty(),
                DBConst.Username.getProperty(),
                DBConst.Secret.getProperty()
        )) {

            Statement statement = connection.createStatement();

            // ---------------------------------------------------------
            // Select all rows
            // ---------------------------------------------------------
            String selectAll = "SELECT * FROM sports";
            ResultSet rs1 = statement.executeQuery(selectAll);

            while (rs1.next()) {
                int id = rs1.getInt("sport_id");
                String name = rs1.getString("sport_name");
                String category = rs1.getString("category");
                boolean teamBased = rs1.getBoolean("team_based");
                String originCountry = rs1.getString("origin_country");
                int popularityRank = rs1.getInt("popularity_rank");
                String equipment = rs1.getString("equipment_needed");
                String indoorOutdoor = rs1.getString("indoor_outdoor");
                String contactLevel = rs1.getString("contact_level");
                boolean olympic = rs1.getBoolean("olympic_sport");

                System.out.println("Sport ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Category: " + category);
                System.out.println("Team Based: " + teamBased);
                System.out.println("Origin Country: " + originCountry);
                System.out.println("Popularity Rank: " + popularityRank);
                System.out.println("Equipment Needed: " + equipment);
                System.out.println("Indoor/Outdoor: " + indoorOutdoor);
                System.out.println("Contact Level: " + contactLevel);
                System.out.println("Olympic Sport: " + olympic);
                System.out.println("---------------------------------------------");
            }

            // ---------------------------------------------------------
            // Select one row
            // ---------------------------------------------------------
            String oneRow = "SELECT * FROM sports WHERE sport_id = 5";
            ResultSet rs2 = statement.executeQuery(oneRow);

            while (rs2.next()) {
                System.out.println("Sport: " + rs2.getString("sport_name"));
            }

            // ---------------------------------------------------------
            // Select one column (all rows)
            // ---------------------------------------------------------
            String colOne = "SELECT sport_name FROM sports";
            ResultSet rs3 = statement.executeQuery(colOne);

            while (rs3.next()) {
                System.out.println("Sport Name: " + rs3.getString("sport_name"));
            }

            // ---------------------------------------------------------
            // Select multiple rows using IN
            // ---------------------------------------------------------
            String multi = "SELECT * FROM sports WHERE sport_id IN (1, 3, 7)";
            ResultSet rs4 = statement.executeQuery(multi);

            while (rs4.next()) {
                System.out.println("Sport ID: " + rs4.getInt("sport_id"));
            }

            // ---------------------------------------------------------
            // Select distinct categories
            // ---------------------------------------------------------
            String distinctCategory = "SELECT DISTINCT category FROM sports";
            ResultSet rs5 = statement.executeQuery(distinctCategory);

            while (rs5.next()) {
                System.out.println("Category: " + rs5.getString("category"));
            }

            // ---------------------------------------------------------
            // Count rows
            // ---------------------------------------------------------
            String count = "SELECT COUNT(*) FROM sports";
            ResultSet rs6 = statement.executeQuery(count);

            if (rs6.next()) {
                System.out.println("Total Sports: " + rs6.getInt(1));
            }

            // ---------------------------------------------------------
            // Latest row (max ID)
            // ---------------------------------------------------------
            String latest = "SELECT * FROM sports ORDER BY sport_id DESC LIMIT 1";
            ResultSet rs7 = statement.executeQuery(latest);

            while (rs7.next()) {
                System.out.println("Latest Sport: " + rs7.getString("sport_name"));
            }

            // ---------------------------------------------------------
            // Oldest row (min ID)
            // ---------------------------------------------------------
            String oldest = "SELECT * FROM sports ORDER BY sport_id ASC LIMIT 1";
            ResultSet rs8 = statement.executeQuery(oldest);

            while (rs8.next()) {
                System.out.println("Oldest Sport: " + rs8.getString("sport_name"));
            }

            // ---------------------------------------------------------
            // Select all rows sorted by ID descending
            // ---------------------------------------------------------
            String desc = "SELECT * FROM sports ORDER BY sport_id DESC";
            ResultSet rs9 = statement.executeQuery(desc);

            while (rs9.next()) {
                System.out.println("Sport ID: " + rs9.getInt("sport_id"));
            }

            // ---------------------------------------------------------
            // Group by category
            // ---------------------------------------------------------
            String group = "SELECT category, COUNT(*) AS total FROM sports GROUP BY category";
            ResultSet rs10 = statement.executeQuery(group);

            while (rs10.next()) {
                System.out.println(rs10.getString("category") +
                        " = " + rs10.getInt("total"));
            }

            // ---------------------------------------------------------
            // Group by + having (categories with >1 sport)
            // ---------------------------------------------------------
            String having = "SELECT category, COUNT(*) AS total FROM sports " +
                    "GROUP BY category HAVING COUNT(*) > 1";
            ResultSet rs11 = statement.executeQuery(having);

            while (rs11.next()) {
                System.out.println("Category with >1 sports: " +
                        rs11.getString("category") + " = " + rs11.getInt("total"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

