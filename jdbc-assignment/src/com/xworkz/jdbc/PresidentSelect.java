package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentSelect {
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
            String selectAll = "SELECT * FROM president";
            ResultSet rs1 = statement.executeQuery(selectAll);

            while (rs1.next()) {
                int id = rs1.getInt("president_id");
                String firstName = rs1.getString("first_name");
                String lastName = rs1.getString("last_name");
                String country = rs1.getString("country");
                int termStart = rs1.getInt("term_start");
                int termEnd = rs1.getInt("term_end");
                String party = rs1.getString("political_party");
                Date birthDate = rs1.getDate("birth_date");
                String birthCity = rs1.getString("birth_city");
                String birthCountry = rs1.getString("birth_country");
                int approval = rs1.getInt("approval_rating");
                String spouse = rs1.getString("spouse_name");
                int children = rs1.getInt("number_of_children");
                String education = rs1.getString("education");
                String previousPosition = rs1.getString("previous_position");
                boolean incumbent = rs1.getBoolean("is_incumbent");

                System.out.println("ID: " + id);
                System.out.println("Name: " + firstName + " " + lastName);
                System.out.println("Country: " + country);
                System.out.println("Term: " + termStart + " - " + termEnd);
                System.out.println("Party: " + party);
                System.out.println("Birth: " + birthDate + " (" + birthCity + ", " + birthCountry + ")");
                System.out.println("Approval Rating: " + approval);
                System.out.println("Spouse: " + spouse);
                System.out.println("Children: " + children);
                System.out.println("Education: " + education);
                System.out.println("Previous Position: " + previousPosition);
                System.out.println("Incumbent: " + incumbent);
                System.out.println("---------------------------------------------");
            }

            // ---------------------------------------------------------
            // Select one row
            // ---------------------------------------------------------
            String oneRow = "SELECT * FROM president WHERE president_id = 5";
            ResultSet rs2 = statement.executeQuery(oneRow);

            while (rs2.next()) {
                System.out.println("President: " +
                        rs2.getString("first_name") + " " +
                        rs2.getString("last_name"));
            }

            // ---------------------------------------------------------
            // Select one column (all rows)
            // ---------------------------------------------------------
            String colOne = "SELECT first_name FROM president";
            ResultSet rs3 = statement.executeQuery(colOne);

            while (rs3.next()) {
                System.out.println("First Name: " + rs3.getString("first_name"));
            }

            // ---------------------------------------------------------
            // Select multiple rows using IN
            // ---------------------------------------------------------
            String multi = "SELECT * FROM president WHERE president_id IN (1,3,7)";
            ResultSet rs4 = statement.executeQuery(multi);

            while (rs4.next()) {
                System.out.println("President ID: " + rs4.getInt("president_id"));
            }

            // ---------------------------------------------------------
            // Select distinct parties
            // ---------------------------------------------------------
            String distinctParty = "SELECT DISTINCT political_party FROM president";
            ResultSet rs5 = statement.executeQuery(distinctParty);

            while (rs5.next()) {
                System.out.println("Party: " + rs5.getString("political_party"));
            }

            // ---------------------------------------------------------
            // Count total rows
            // ---------------------------------------------------------
            String count = "SELECT COUNT(*) FROM president";
            ResultSet rs6 = statement.executeQuery(count);

            if (rs6.next()) {
                System.out.println("Total Presidents: " + rs6.getInt(1));
            }

            // ---------------------------------------------------------
            // Select latest row (highest ID)
            // ---------------------------------------------------------
            String latest = "SELECT * FROM president ORDER BY president_id DESC LIMIT 1";
            ResultSet rs7 = statement.executeQuery(latest);

            while (rs7.next()) {
                System.out.println("Latest President: " +
                        rs7.getString("first_name") + " " +
                        rs7.getString("last_name"));
            }

            // ---------------------------------------------------------
            // Select oldest row (lowest ID)
            // ---------------------------------------------------------
            String oldest = "SELECT * FROM president ORDER BY president_id ASC LIMIT 1";
            ResultSet rs8 = statement.executeQuery(oldest);

            while (rs8.next()) {
                System.out.println("Oldest Record: " + rs8.getString("first_name"));
            }

            // ---------------------------------------------------------
            // Select all rows sorted by ID descending
            // ---------------------------------------------------------
            String desc = "SELECT * FROM president ORDER BY president_id DESC";
            ResultSet rs9 = statement.executeQuery(desc);

            while (rs9.next()) {
                System.out.println("President ID: " + rs9.getInt("president_id"));
            }

            // ---------------------------------------------------------
            // Group by political party
            // ---------------------------------------------------------
            String group = "SELECT political_party, COUNT(*) AS total FROM president GROUP BY political_party";
            ResultSet rs10 = statement.executeQuery(group);

            while (rs10.next()) {
                System.out.println(rs10.getString("political_party") +
                        " = " + rs10.getInt("total"));
            }

            // ---------------------------------------------------------
            // Group by + Having
            // ---------------------------------------------------------
            String having = "SELECT political_party, COUNT(*) AS total FROM president GROUP BY political_party HAVING COUNT(*) > 1";
            ResultSet rs11 = statement.executeQuery(having);

            while (rs11.next()) {
                System.out.println("Party with >1 presidents: " +
                        rs11.getString("political_party") + " = " + rs11.getInt("total"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
