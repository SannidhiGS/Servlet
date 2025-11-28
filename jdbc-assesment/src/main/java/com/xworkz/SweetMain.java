package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SweetMain {
    public static void main(String[] args) throws SQLException {
        String url="jdbc:mysql://localhost:3306/sweet_db";
        String user="root";
        String password="Sannidhi@123";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("The connection built successfully");
            String sql = "INSERT INTO sweet_data (sweet_id, sweet_name, sweet_type, price, wieght, bakers_name, sweet_color) VALUES"
                    + "(3, 'Kaju Katli', 'Cashew Sweet', 450.00, 200, 'Sri Mithai', 'White'),"
                    + "(4, 'Rasgulla', 'Milk Sweet', 200.00, 350, 'Haldirams', 'White'),"
                    + "(5, 'Barfi', 'Milk Sweet', 180.00, 280, 'Nandini Sweets', 'Cream'),"
                    + "(6, 'Soan Papdi', 'Flaky Sweet', 160.00, 250, 'Mithas', 'Yellow'),"
                    + "(7, 'Mysore Pak', 'Ghee Sweet', 220.00, 300, 'Sri Krishna Sweets', 'Yellow'),"
                    + "(8, 'Peda', 'Milk Sweet', 140.00, 200, 'Nandini Sweets', 'Cream'),"
                    + "(9, 'Cham Cham', 'Bengali Sweet', 190.00, 320, 'Kalakand House', 'Pink'),"
                    + "(10, 'Halwa', 'Ghee Sweet', 130.00, 350, 'Annapurna Sweets', 'Brown'),"
                    + "(11, 'Malpua', 'Fried Sweet', 170.00, 280, 'Anand Sweets', 'Golden'),"
                    + "(12, 'Sandesh', 'Bengali Sweet', 200.00, 210, 'Sweet Bengal', 'White'),"
                    + "(13, 'Gulab Jamun', 'Milk Sweet', 150.00, 300, 'Haldirams', 'Brown'),"
                    + "(14, 'Rabri', 'Milk Sweet', 250.00, 250, 'Bombay Sweets', 'Cream'),"
                    + "(15, 'Basundi', 'Milk Sweet', 230.00, 350, 'Sri Mithai', 'White'),"
                    + "(16, 'Badam Halwa', 'Nut Sweet', 300.00, 270, 'Sri Krishna Sweets', 'Yellow'),"
                    + "(17, 'Chikki', 'Nut Sweet', 100.00, 200, 'Lonavala Sweets', 'Brown'),"
                    + "(18, 'Kheer', 'Milk Pudding', 180.00, 300, 'Nandini Sweets', 'White'),"
                    + "(19, 'Payasam', 'South Indian Sweet', 200.00, 330, 'Udupi Sweets', 'Yellow'),"
                    + "(20, 'Pineapple Cake', 'Bakery Sweet', 350.00, 500, 'JustBake', 'Yellow'),"
                    + "(21, 'Chocolate Cake', 'Bakery Sweet', 380.00, 550, 'JustBake', 'Brown'),"
                    + "(22, 'Strawberry Cake', 'Bakery Sweet', 360.00, 520, 'CakeZone', 'Pink'),"
                    + "(23, 'Chum Chum', 'Bengali Sweet', 210.00, 300, 'Sweet Bengal', 'Yellow'),"
                    + "(24, 'Dry Fruit Barfi', 'Milk Sweet', 450.00, 250, 'Anand Sweets', 'White'),"
                    + "(25, 'Kesar Peda', 'Milk Sweet', 260.00, 200, 'Bombay Sweets', 'Yellow'),"
                    + "(26, 'Motichoor Ladoo', 'Round Sweet', 240.00, 280, 'Haldirams', 'Orange'),"
                    + "(27, 'Gajar Halwa', 'Vegetable Sweet', 200.00, 350, 'Mithas', 'Orange'),"
                    + "(28, 'Milk Cake', 'Milk Sweet', 220.00, 300, 'Sri Krishna Sweets', 'Brown'),"
                    + "(29, 'Apple Barfi', 'Fruit Sweet', 260.00, 220, 'Nandini Sweets', 'Red'),"
                    + "(30, 'Pan Sweet', 'Special Sweet', 180.00, 250, 'Mithas', 'Green'),"
                    + "(31, 'Kesar Katli', 'Cashew Sweet', 480.00, 200, 'Sri Mithai', 'Yellow'),"
                    + "(32, 'Coconut Barfi', 'Coconut Sweet', 210.00, 230, 'Annapurna Sweets', 'White'),"
                    + "(33, 'Kaju Roll', 'Cashew Sweet', 490.00, 200, 'Anand Sweets', 'White'),"
                    + "(34, 'Dry Jamun', 'Milk Sweet', 190.00, 300, 'Haldirams', 'Brown'),"
                    + "(35, 'Boondi', 'Fried Sweet', 140.00, 250, 'Bombay Sweets', 'Orange'),"
                    + "(36, 'Kesari Bath', 'Semolina Sweet', 130.00, 330, 'Udupi Sweets', 'Yellow'),"
                    + "(37, 'Rava Laddu', 'Semolina Sweet', 150.00, 280, 'Udupi Sweets', 'White'),"
                    + "(38, 'Pista Burfi', 'Nut Sweet', 420.00, 230, 'Sri Krishna Sweets', 'Green'),"
                    + "(39, 'Mango Barfi', 'Fruit Sweet', 260.00, 250, 'Anand Sweets', 'Yellow'),"
                    + "(40, 'Rose Peda', 'Milk Sweet', 230.00, 220, 'Nandini Sweets', 'Pink'),"
                    + "(41, 'Kheer Kadam', 'Bengali Sweet', 250.00, 260, 'Sweet Bengal', 'White'),"
                    + "(42, 'Bread Halwa', 'Ghee Sweet', 170.00, 300, 'Mithas', 'Brown'),"
                    + "(43, 'Khoya Barfi', 'Milk Sweet', 240.00, 240, 'Anand Sweets', 'White'),"
                    + "(44, 'Choco Ladoo', 'Round Sweet', 210.00, 230, 'JustBake', 'Brown'),"
                    + "(45, 'Kesari Peda', 'Milk Sweet', 260.00, 250, 'Bombay Sweets', 'Yellow'),"
                    + "(46, 'Dry Fruit Laddu', 'Nut Sweet', 350.00, 260, 'Sri Krishna Sweets', 'Brown'),"
                    + "(47, 'Kaju Strawberry', 'Cashew Sweet', 500.00, 180, 'Anand Sweets', 'Pink'),"
                    + "(48, 'Chocolate Barfi', 'Milk Sweet', 280.00, 250, 'CakeZone', 'Brown'),"
                    + "(49, 'Honey Cake', 'Bakery Sweet', 300.00, 400, 'JustBake', 'Red'),"
                    + "(50, 'Milk Mysore Pak', 'Milk Sweet', 230.00, 300, 'Sri Krishna Sweets', 'Yellow'),"
                    + "(51, 'Banana Halwa', 'Fruit Sweet', 200.00, 350, 'Udupi Sweets', 'Yellow'),"
                    + "(52, 'Pineapple Halwa', 'Fruit Sweet', 240.00, 300, 'Anand Sweets', 'Yellow'),"
                    + "(53, 'Jackfruit Halwa', 'Fruit Sweet', 260.00, 330, 'Mithas', 'Brown'),"
                    + "(54, 'Dry Fruit Cake', 'Bakery Sweet', 450.00, 500, 'CakeZone', 'Brown'),"
                    + "(55, 'Orange Burfi', 'Fruit Sweet', 240.00, 250, 'Nandini Sweets', 'Orange'),"
                    + "(56, 'Ghee Laddu', 'Round Sweet', 260.00, 290, 'Sri Krishna Sweets', 'Yellow'),"
                    + "(57, 'Pista Laddu', 'Nut Sweet', 300.00, 260, 'Anand Sweets', 'Green'),"
                    + "(58, 'Fig Barfi', 'Dry Fruit Sweet', 420.00, 230, 'Anand Sweets', 'Brown'),"
                    + "(59, 'Dry Coconut Laddu', 'Coconut Sweet', 200.00, 250, 'Mithas', 'White'),"
                    + "(60, 'Kesari Roll', 'Milk Sweet', 250.00, 200, 'Bombay Sweets', 'Yellow'),"
                    + "(61, 'Cashew Ball', 'Nut Sweet', 480.00, 180, 'Sri Mithai', 'White'),"
                    + "(62, 'Milk Burfi', 'Milk Sweet', 220.00, 250, 'Sri Krishna Sweets', 'Cream'),"
                    + "(63, 'Carrot Burfi', 'Vegetable Sweet', 260.00, 260, 'Annapurna Sweets', 'Orange'),"
                    + "(64, 'Dry Rasgulla', 'Milk Sweet', 210.00, 280, 'Haldirams', 'White'),"
                    + "(65, 'Kesar Malai', 'Milk Sweet', 260.00, 240, 'Nandini Sweets', 'Yellow'),"
                    + "(66, 'Pista Roll', 'Nut Sweet', 420.00, 200, 'Anand Sweets', 'Green'),"
                    + "(67, 'Mango Laddu', 'Fruit Sweet', 240.00, 250, 'Mithas', 'Yellow'),"
                    + "(68, 'Rose Barfi', 'Milk Sweet', 230.00, 220, 'Annapurna Sweets', 'Pink'),"
                    + "(69, 'Coconut Roll', 'Coconut Sweet', 240.00, 240, 'Sri Krishna Sweets', 'White'),"
                    + "(70, 'Bombay Halwa', 'Ghee Sweet', 260.00, 300, 'Bombay Sweets', 'Orange'),"
                    + "(71, 'Dry Fruit Mysore Pak', 'Nut Sweet', 480.00, 300, 'Sri Mithai', 'Brown'),"
                    + "(72, 'Mixed Sweet Box', 'Assorted', 600.00, 600, 'Anand Sweets', 'Multi'),"
                    + "(73, 'Coconut Laddu', 'Coconut Sweet', 210.00, 250, 'Nandini Sweets', 'White'),"
                    + "(74, 'Chocolate Roll', 'Milk Sweet', 260.00, 230, 'CakeZone', 'Brown'),"
                    + "(75, 'Raspberry Cake', 'Bakery Sweet', 380.00, 550, 'JustBake', 'Red');";

            Statement statement= connection.createStatement();
            int rowsInsertion=statement.executeUpdate(sql);
            System.out.println("Update operations: ");
            System.out.println(
            statement.executeUpdate("UPDATE sweet_data SET sweet_color='pink' WHERE sweet_id=1"));
            System.out.println(statement.executeUpdate("UPDATE sweet_data SET sweet_name='halkowa' WHERE sweet_id=4"));
            System.out.println(statement.executeUpdate("UPDATE sweet_data SET sweet_type='traditional' WHERE sweet_id=8"));
            System.out.println(statement.executeUpdate("UPDATE sweet_data SET sweet_color='appletaurt' WHERE sweet_id=7"));

           System.out.println("rowsInsertion"+rowsInsertion);

            System.out.println("Delete by ID:");
            int deletById=statement.executeUpdate("DELETE from sweet_data where sweet_id=1");
            System.out.println("deletById"+deletById);

            System.out.println("Delete by bakers_name:");
            int deletByBaker=statement.executeUpdate("DELETE from sweet_data where bakers_name='JustBake'");
            System.out.println("deletByBaker"+deletByBaker);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
