package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sports {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sindhu@478";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query="\n" +
                    "INSERT INTO sweet (sweet_id, sweet_name, category, flavor, price, origin, availability) VALUES\n" +
                    "(1,'Honey Cake','Bakery','Honey',4.50,'USA',TRUE),\n" +
                    "(2,'Chocolate Bar','Candy','Chocolate',1.25,'Belgium',TRUE),\n" +
                    "(3,'Strawberry Tart','Pastry','Strawberry',3.75,'France',TRUE),\n" +
                    "(4,'Caramel Fudge','Candy','Caramel',2.00,'USA',TRUE),\n" +
                    "(5,'Vanilla Donut','Bakery','Vanilla',1.15,'USA',TRUE),\n" +
                    "(6,'Mango Pudding','Dessert','Mango',2.80,'Thailand',TRUE),\n" +
                    "(7,'Blueberry Muffin','Bakery','Blueberry',2.20,'Canada',TRUE),\n" +
                    "(8,'Mint Toffee','Candy','Mint',0.99,'UK',TRUE),\n" +
                    "(9,'Coconut Bar','Candy','Coconut',1.35,'India',TRUE),\n" +
                    "(10,'Lemon Pie','Pastry','Lemon',3.40,'USA',TRUE),\n" +
                    "(11,'Grape Jelly','Spread','Grape',2.10,'USA',TRUE),\n" +
                    "(12,'Milk Chocolate','Candy','Chocolate',1.50,'Switzerland',TRUE),\n" +
                    "(13,'Raspberry Cake','Bakery','Raspberry',4.10,'France',TRUE),\n" +
                    "(14,'Peanut Brittle','Candy','Peanut',1.80,'USA',TRUE),\n" +
                    "(15,'Coffee Bun','Bakery','Coffee',2.50,'Italy',TRUE),\n" +
                    "(16,'Hazelnut Truffle','Candy','Hazelnut',3.00,'Germany',TRUE),\n" +
                    "(17,'Orange Marmalade','Spread','Orange',2.30,'USA',TRUE),\n" +
                    "(18,'Pineapple Tart','Pastry','Pineapple',3.25,'Malaysia',TRUE),\n" +
                    "(19,'Banana Bread','Bakery','Banana',2.90,'USA',TRUE),\n" +
                    "(20,'Matcha Cookie','Bakery','Matcha',1.95,'Japan',TRUE),\n" +
                    "(21,'Cinnamon Roll','Bakery','Cinnamon',3.10,'Sweden',TRUE),\n" +
                    "(22,'Ginger Candy','Candy','Ginger',1.15,'China',TRUE),\n" +
                    "(23,'Peach Cobbler','Dessert','Peach',3.95,'USA',TRUE),\n" +
                    "(24,'Lychee Jelly','Dessert','Lychee',2.55,'Singapore',TRUE),\n" +
                    "(25,'Almond Biscuit','Bakery','Almond',1.60,'Italy',TRUE),\n" +
                    "(26,'Blackberry Tart','Pastry','Blackberry',3.85,'UK',TRUE),\n" +
                    "(27,'Choco Chip Cookie','Bakery','Chocolate',1.20,'USA',TRUE),\n" +
                    "(28,'Butterscotch Fudge','Candy','Butterscotch',2.25,'USA',TRUE),\n" +
                    "(29,'Coconut Donut','Bakery','Coconut',1.30,'India',TRUE),\n" +
                    "(30,'Carrot Cake','Bakery','Carrot',3.50,'USA',TRUE),\n" +
                    "(31,'Marshmallow','Candy','Vanilla',0.85,'USA',TRUE),\n" +
                    "(32,'Brownie','Dessert','Chocolate',2.40,'USA',TRUE),\n" +
                    "(33,'Cherry Pie','Pastry','Cherry',3.75,'USA',TRUE),\n" +
                    "(34,'Almond Joy','Candy','Almond',1.75,'USA',TRUE),\n" +
                    "(35,'Pecan Tart','Pastry','Pecan',3.95,'USA',TRUE),\n" +
                    "(36,'Maple Cookie','Bakery','Maple',1.90,'Canada',TRUE),\n" +
                    "(37,'Apple Pie','Pastry','Apple',3.60,'USA',TRUE),\n" +
                    "(38,'Chocolate Truffle','Candy','Chocolate',2.85,'Belgium',TRUE),\n" +
                    "(39,'Lime Cupcake','Bakery','Lime',2.10,'USA',TRUE),\n" +
                    "(40,'Berry Cheesecake','Dessert','Mixed Berry',4.90,'USA',TRUE),\n" +
                    "(41,'Mint Chocolate','Candy','Mint',1.40,'Switzerland',TRUE),\n" +
                    "(42,'Custard Bun','Pastry','Custard',2.60,'China',TRUE),\n" +
                    "(43,'Caramel Donut','Bakery','Caramel',1.40,'USA',TRUE),\n" +
                    "(44,'Oreo Cake','Bakery','Chocolate',4.20,'USA',TRUE),\n" +
                    "(45,'Tiramisu','Dessert','Coffee',5.25,'Italy',TRUE),\n" +
                    "(46,'Walnut Cookie','Bakery','Walnut',1.75,'USA',TRUE),\n" +
                    "(47,'Pandan Cake','Bakery','Pandan',3.15,'Malaysia',TRUE),\n" +
                    "(48,'Kiwi Tart','Pastry','Kiwi',3.55,'New Zealand',TRUE),\n" +
                    "(49,'Dark Chocolate Bar','Candy','Chocolate',1.95,'Belgium',TRUE),\n" +
                    "(50,'Cranberry Muffin','Bakery','Cranberry',2.25,'Canada',TRUE),\n" +
                    "(51,'Fig Pastry','Pastry','Fig',3.80,'Turkey',TRUE),\n" +
                    "(52,'Sour Candy','Candy','Mixed',1.05,'USA',TRUE),\n" +
                    "(53,'Milk Toffee','Candy','Milk',1.10,'India',TRUE),\n" +
                    "(54,'Cocoa Cupcake','Bakery','Chocolate',2.00,'USA',TRUE),\n" +
                    "(55,'Guava Jelly','Dessert','Guava',2.45,'Brazil',TRUE),\n" +
                    "(56,'Meringue','Dessert','Vanilla',1.85,'France',TRUE),\n" +
                    "(57,'Caramel Bar','Candy','Caramel',1.55,'USA',TRUE),\n" +
                    "(58,'Cashew Cookie','Bakery','Cashew',1.80,'India',TRUE),\n" +
                    "(59,'Black Forest Cake','Dessert','Chocolate',5.10,'Germany',TRUE),\n" +
                    "(60,'Papaya Pudding','Dessert','Papaya',3.00,'Mexico',TRUE),\n" +
                    "(61,'Mint Jelly','Spread','Mint',1.95,'UK',TRUE),\n" +
                    "(62,'Sweet Bun','Bakery','Plain',1.10,'USA',TRUE),\n" +
                    "(63,'Coconut Fudge','Candy','Coconut',1.70,'India',TRUE),\n" +
                    "(64,'Chocolate Muffin','Bakery','Chocolate',2.30,'USA',TRUE),\n" +
                    "(65,'Fruit Tart','Pastry','Mixed',4.25,'France',TRUE),\n" +
                    "(66,'Almond Cake','Bakery','Almond',3.95,'Italy',TRUE),\n" +
                    "(67,'Pistachio Cookie','Bakery','Pistachio',1.95,'Iran',TRUE),\n" +
                    "(68,'Caramel Biscuit','Bakery','Caramel',1.55,'UK',TRUE),\n" +
                    "(69,'Hazelnut Spread','Spread','Hazelnut',2.75,'Italy',TRUE),\n" +
                    "(70,'Strawberry Donut','Bakery','Strawberry',1.20,'USA',TRUE),\n" +
                    "(71,'Dark Fudge','Candy','Chocolate',1.85,'USA',TRUE),\n" +
                    "(72,'Cherry Tart','Pastry','Cherry',3.70,'USA',TRUE),\n" +
                    "(73,'Lemon Cupcake','Bakery','Lemon',2.05,'USA',TRUE),\n" +
                    "(74,'Berry Jelly','Dessert','Berry',2.25,'USA',TRUE),\n" +
                    "(75,'Vanilla Cake','Bakery','Vanilla',4.00,'USA',TRUE);";

            Statement statement=connection.createStatement();
            int rowsAffected=statement.executeUpdate(query);
            System.out.println("rowsAffected"+rowsAffected);
        } catch (SQLException e) {
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("ErrorCode: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }

    }
}
