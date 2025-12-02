package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

    public class HospitalSelect {

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
                String selectAll = "SELECT * FROM hospital";
                ResultSet rs1 = statement.executeQuery(selectAll);

                while (rs1.next()) {
                    int id = rs1.getInt("hospital_id");
                    String name = rs1.getString("hospital_name");
                    String city = rs1.getString("city");
                    String state = rs1.getString("state");
                    String country = rs1.getString("country");
                    int bedCapacity = rs1.getInt("bed_capacity");
                    String type = rs1.getString("hospital_type");
                    int established = rs1.getInt("established_year");
                    boolean hasEmergency = rs1.getBoolean("has_emergency");
                    String accreditation = rs1.getString("accreditation");

                    System.out.println("Hospital ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("City: " + city);
                    System.out.println("State: " + state);
                    System.out.println("Country: " + country);
                    System.out.println("Beds: " + bedCapacity);
                    System.out.println("Type: " + type);
                    System.out.println("Established: " + established);
                    System.out.println("Emergency Service: " + hasEmergency);
                    System.out.println("Accreditation: " + accreditation);
                    System.out.println("---------------------------------------------");
                }

                // ---------------------------------------------------------
                // Select one row
                // ---------------------------------------------------------
                String oneRow = "SELECT * FROM hospital WHERE hospital_id = 5";
                ResultSet rs2 = statement.executeQuery(oneRow);

                while (rs2.next()) {
                    System.out.println("Hospital: " + rs2.getString("hospital_name"));
                }

                // ---------------------------------------------------------
                // Select one column (all rows)
                // ---------------------------------------------------------
                String colOne = "SELECT hospital_name FROM hospital";
                ResultSet rs3 = statement.executeQuery(colOne);

                while (rs3.next()) {
                    System.out.println("Hospital Name: " + rs3.getString("hospital_name"));
                }

                // ---------------------------------------------------------
                // Select multiple rows using IN
                // ---------------------------------------------------------
                String multi = "SELECT * FROM hospital WHERE hospital_id IN (1,3,7)";
                ResultSet rs4 = statement.executeQuery(multi);

                while (rs4.next()) {
                    System.out.println("Hospital ID: " + rs4.getInt("hospital_id"));
                }

                // ---------------------------------------------------------
                // Select distinct hospital types
                // ---------------------------------------------------------
                String distinctType = "SELECT DISTINCT hospital_type FROM hospital";
                ResultSet rs5 = statement.executeQuery(distinctType);

                while (rs5.next()) {
                    System.out.println("Hospital Type: " + rs5.getString("hospital_type"));
                }

                // ---------------------------------------------------------
                // Count total rows
                // ---------------------------------------------------------
                String count = "SELECT COUNT(*) FROM hospital";
                ResultSet rs6 = statement.executeQuery(count);

                if (rs6.next()) {
                    System.out.println("Total Hospitals: " + rs6.getInt(1));
                }

                // ---------------------------------------------------------
                // Latest hospital (highest ID)
                // ---------------------------------------------------------
                String latest = "SELECT * FROM hospital ORDER BY hospital_id DESC LIMIT 1";
                ResultSet rs7 = statement.executeQuery(latest);

                while (rs7.next()) {
                    System.out.println("Latest Hospital: " + rs7.getString("hospital_name"));
                }

                // ---------------------------------------------------------
                // Oldest hospital (lowest ID)
                // ---------------------------------------------------------
                String oldest = "SELECT * FROM hospital ORDER BY hospital_id ASC LIMIT 1";
                ResultSet rs8 = statement.executeQuery(oldest);

                while (rs8.next()) {
                    System.out.println("Oldest Hospital: " + rs8.getString("hospital_name"));
                }

                // ---------------------------------------------------------
                // Select all rows sorted by ID descending
                // ---------------------------------------------------------
                String desc = "SELECT * FROM hospital ORDER BY hospital_id DESC";
                ResultSet rs9 = statement.executeQuery(desc);

                while (rs9.next()) {
                    System.out.println("Hospital ID: " + rs9.getInt("hospital_id"));
                }

                // ---------------------------------------------------------
                // Group by hospital type
                // ---------------------------------------------------------
                String group = "SELECT hospital_type, COUNT(*) AS total FROM hospital GROUP BY hospital_type";
                ResultSet rs10 = statement.executeQuery(group);

                while (rs10.next()) {
                    System.out.println(rs10.getString("hospital_type") +
                            " = " + rs10.getInt("total"));
                }

                // ---------------------------------------------------------
                // Group by + Having example (types with more than 1 hospital)
                // ---------------------------------------------------------
                String having = "SELECT hospital_type, COUNT(*) AS total FROM hospital GROUP BY hospital_type HAVING COUNT(*) > 1";
                ResultSet rs11 = statement.executeQuery(having);

                while (rs11.next()) {
                    System.out.println("Hospital type with >1 hospitals: " +
                            rs11.getString("hospital_type") + " = " + rs11.getInt("total"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }


