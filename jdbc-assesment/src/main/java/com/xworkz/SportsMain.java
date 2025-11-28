package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SportsMain {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sports_db";
        String user = "root";
        String password = "Sannidhi@123";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            System.out.println("Connection built successfully");

         String sqlInsert = "INSERT INTO sports " +
                    "(sport_name, team_size, indoor_outdoor, origin_country, olympic, world_cup_frequency, equipment_needed, popularity_rank, governing_body) VALUES " +
                    "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                    "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                    "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                    "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                    "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                    "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                    "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                    "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                    "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                    "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA')," +
                    "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                    "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                    "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                    "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                    "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                    "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                    "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                    "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                    "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                    "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA')," +
                    "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                    "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                    "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                    "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                    "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                    "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                    "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                    "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                    "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                    "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA')," +
                    "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                    "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                    "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                    "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                    "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                    "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                    "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                    "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                    "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                    "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA')," +
                    "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                    "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                    "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                    "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                    "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                    "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                    "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                    "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                    "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                    "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA')," +
                    "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                    "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                    "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                    "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                    "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                    "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                    "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                    "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                 "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                 "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                 "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                    "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                 "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                 "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                 "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA')," +
                 "('Cricket', 11, 'Outdoor', 'India', false, 4, 'Bat, Ball, Pads, Helmet', 1, 'ICC')," +
                 "('Football', 11, 'Outdoor', 'USA', true, 4, 'Ball, Goalpost', 2, 'FIFA')," +
                 "('Basketball', 5, 'Indoor', 'USA', true, 2, 'Ball, Hoop', 3, 'FIBA')," +
                 "('Tennis', 1, 'Indoor', 'USA', true, 2, 'Racket, Ball, Net', 4, 'ITF')," +
                 "('Hockey', 11, 'Outdoor', 'India', true, 4, 'Stick, Ball, Goal', 5, 'FIH')," +
                 "('Volleyball', 6, 'Indoor', 'USA', true, 2, 'Ball, Net', 6, 'FIVB')," +
                 "('Badminton', 2, 'Indoor', 'USA', true, 2, 'Racket, Shuttlecock', 7, 'BWF')," +
                 "('Table Tennis', 2, 'Indoor', 'USA', true, 2, 'Racket, Ball, Table', 8, 'ITTF')," +
                 "('Rugby', 15, 'Outdoor', 'USA', true, 4, 'Ball, Pads', 9, 'World Rugby')," +
                    "('Swimming', 1, 'Indoor', 'USA', true, 2, 'Swimsuit, Goggles', 10, 'FINA');";



            int rowsInserted = statement.executeUpdate(sqlInsert);
            System.out.println("Rows inserted: " + rowsInserted);

            statement.executeUpdate("UPDATE sports SET sport_name='Soccer' WHERE sport_id=2");
            statement.executeUpdate("UPDATE sports SET team_size=7 WHERE sport_id=3");
            statement.executeUpdate("UPDATE sports SET popularity_rank=1 WHERE sport_id=4");
            statement.executeUpdate("UPDATE sports SET olympic=false WHERE sport_id=5");
            System.out.println("Updated 4 columns successfully");

            int deletedById = statement.executeUpdate("DELETE FROM sports WHERE sport_id=1");
            System.out.println("Deleted by ID: " + deletedById);

            int deletedByOrigin = statement.executeUpdate("DELETE FROM sports WHERE origin_country='USA'");
            System.out.println("Deleted by origin_country: " + deletedByOrigin);
            statement.close();
            connection.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
