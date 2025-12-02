package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Street {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sindhu@478";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query="INSERT INTO sports (sport_id, sport_name, category, team_based, origin_country, popularity_rank, equipment_needed, indoor_outdoor, contact_level, olympic_sport) VALUES\n" +
                    "(1,'Soccer','Ball Sport',TRUE,'England',1,'Ball','Outdoor','Medium',TRUE),\n" +
                    "(2,'Basketball','Ball Sport',TRUE,'USA',2,'Ball, Hoop','Indoor/Outdoor','Medium',TRUE),\n" +
                    "(3,'Tennis','Racquet Sport',FALSE,'France',4,'Racquet, Ball','Outdoor','Low',TRUE),\n" +
                    "(4,'Baseball','Bat Sport',TRUE,'USA',6,'Bat, Ball, Glove','Outdoor','Low',TRUE),\n" +
                    "(5,'Cricket','Bat Sport',TRUE,'England',3,'Bat, Ball, Pads','Outdoor','Low',FALSE),\n" +
                    "(6,'Rugby','Field Sport',TRUE,'UK',16,'Ball','Outdoor','High',FALSE),\n" +
                    "(7,'Volleyball','Ball Sport',TRUE,'USA',11,'Ball, Net','Indoor/Outdoor','Medium',TRUE),\n" +
                    "(8,'Table Tennis','Racquet Sport',FALSE,'England',7,'Paddle, Ball','Indoor','Low',TRUE),\n" +
                    "(9,'Golf','Precision Sport',FALSE,'Scotland',10,'Clubs, Balls','Outdoor','Low',TRUE),\n" +
                    "(10,'Hockey','Stick Sport',TRUE,'Canada',9,'Stick, Puck','Indoor/Outdoor','High',TRUE),\n" +
                    "(11,'Swimming','Water Sport',FALSE,'Various',5,'Swimsuit','Indoor/Outdoor','Low',TRUE),\n" +
                    "(12,'Boxing','Combat Sport',FALSE,'Various',8,'Gloves','Indoor','High',TRUE),\n" +
                    "(13,'Karate','Combat Sport',FALSE,'Japan',18,'Uniform','Indoor','High',TRUE),\n" +
                    "(14,'Judo','Combat Sport',FALSE,'Japan',20,'Gi','Indoor','High',TRUE),\n" +
                    "(15,'Badminton','Racquet Sport',FALSE,'India',12,'Racquet, Shuttle','Indoor','Low',TRUE),\n" +
                    "(16,'Fencing','Combat Sport',FALSE,'Spain',30,'Foil, Mask','Indoor','Medium',TRUE),\n" +
                    "(17,'Archery','Precision Sport',FALSE,'Mongolia',25,'Bow, Arrows','Outdoor','Low',TRUE),\n" +
                    "(18,'Rowing','Water Sport',TRUE,'UK',29,'Boat, Oars','Outdoor','High',TRUE),\n" +
                    "(19,'Wrestling','Combat Sport',FALSE,'Greece',14,'Uniform','Indoor','High',TRUE),\n" +
                    "(20,'Cycling','Racing Sport',FALSE,'France',13,'Bicycle','Outdoor','High',TRUE),\n" +
                    "(21,'Skateboarding','Extreme Sport',FALSE,'USA',27,'Skateboard','Outdoor','Medium',TRUE),\n" +
                    "(22,'Surfing','Water Sport',FALSE,'Hawaii',22,'Surfboard','Outdoor','Medium',TRUE),\n" +
                    "(23,'Snowboarding','Winter Sport',FALSE,'USA',34,'Snowboard','Outdoor','Medium',TRUE),\n" +
                    "(24,'Skiing','Winter Sport',FALSE,'Norway',19,'Skis','Outdoor','Low',TRUE),\n" +
                    "(25,'Handball','Ball Sport',TRUE,'Germany',28,'Ball','Indoor','Medium',TRUE),\n" +
                    "(26,'Water Polo','Water Sport',TRUE,'England',33,'Ball','Indoor/Outdoor','High',TRUE),\n" +
                    "(27,'Softball','Bat Sport',TRUE,'USA',21,'Bat, Ball','Outdoor','Low',TRUE),\n" +
                    "(28,'Dodgeball','Ball Sport',TRUE,'USA',40,'Ball','Indoor','Medium',FALSE),\n" +
                    "(29,'Lacrosse','Stick Sport',TRUE,'Canada',31,'Stick, Ball','Outdoor','High',TRUE),\n" +
                    "(30,'Field Hockey','Stick Sport',TRUE,'UK',17,'Stick, Ball','Outdoor','Medium',TRUE),\n" +
                    "(31,'Kickboxing','Combat Sport',FALSE,'Japan',23,'Gloves','Indoor','High',FALSE),\n" +
                    "(32,'Taekwondo','Combat Sport',FALSE,'Korea',26,'Uniform','Indoor','High',TRUE),\n" +
                    "(33,'Box Cricket','Bat Sport',TRUE,'India',35,'Bat, Ball','Indoor','Low',FALSE),\n" +
                    "(34,'Bowling','Indoor Sport',FALSE,'Germany',36,'Bowling Ball','Indoor','Low',FALSE),\n" +
                    "(35,'Snooker','Cue Sport',FALSE,'India',38,'Cue, Balls','Indoor','Low',FALSE),\n" +
                    "(36,'Billiards','Cue Sport',FALSE,'France',41,'Cue, Balls','Indoor','Low',FALSE),\n" +
                    "(37,'Gymnastics','Artistic Sport',FALSE,'Greece',15,'Mat','Indoor','Medium',TRUE),\n" +
                    "(38,'Triathlon','Endurance Sport',FALSE,'USA',32,'Various','Outdoor','High',TRUE),\n" +
                    "(39,'Rock Climbing','Extreme Sport',FALSE,'Various',24,'Harness','Indoor/Outdoor','High',FALSE),\n" +
                    "(40,'Kayaking','Water Sport',FALSE,'Europe',39,'Kayak, Oar','Outdoor','Medium',TRUE),\n" +
                    "(41,'Canoeing','Water Sport',FALSE,'Canada',42,'Canoe, Oar','Outdoor','Medium',TRUE),\n" +
                    "(42,'Polo','Field Sport',TRUE,'Iran',45,'Horse, Mallet','Outdoor','Medium',FALSE),\n" +
                    "(43,'Ultimate Frisbee','Disc Sport',TRUE,'USA',37,'Frisbee','Outdoor','Medium',FALSE),\n" +
                    "(44,'Equestrian','Riding Sport',FALSE,'UK',43,'Horse','Outdoor','Low',TRUE),\n" +
                    "(45,'Horse Racing','Racing Sport',FALSE,'UK',44,'Horse','Outdoor','High',FALSE),\n" +
                    "(46,'Motorsport','Racing Sport',FALSE,'Germany',46,'Car, Gear','Outdoor','High',FALSE),\n" +
                    "(47,'Formula 1','Motorsport',FALSE,'UK',47,'Car, Helmet','Outdoor','High',FALSE),\n" +
                    "(48,'Track Running','Athletics',FALSE,'Greece',48,'Shoes','Outdoor','Low',TRUE),\n" +
                    "(49,'Shot Put','Athletics',FALSE,'Greece',49,'Metal Ball','Outdoor','Low',TRUE),\n" +
                    "(50,'Discus Throw','Athletics',FALSE,'Greece',50,'Discus','Outdoor','Low',TRUE),\n" +
                    "(51,'High Jump','Athletics',FALSE,'Greece',51,'None','Outdoor','Low',TRUE),\n" +
                    "(52,'Long Jump','Athletics',FALSE,'Greece',52,'None','Outdoor','Low',TRUE),\n" +
                    "(53,'Triquetra Ball','Ball Sport',TRUE,'Spain',60,'Ball','Outdoor','Medium',FALSE),\n" +
                    "(54,'Beach Volleyball','Ball Sport',TRUE,'USA',53,'Ball','Outdoor','Medium',TRUE),\n" +
                    "(55,'Kabaddi','Combat Sport',TRUE,'India',54,'None','Indoor/Outdoor','High',FALSE),\n" +
                    "(56,'Sepak Takraw','Foot Sport',TRUE,'Malaysia',55,'Woven Ball','Indoor/Outdoor','Medium',TRUE),\n" +
                    "(57,'Paddle Tennis','Racquet Sport',FALSE,'USA',56,'Paddle, Ball','Outdoor','Low',FALSE),\n" +
                    "(58,'Pickleball','Racquet Sport',FALSE,'USA',57,'Paddle, Ball','Indoor/Outdoor','Low',FALSE),\n" +
                    "(59,'Inline Hockey','Skate Sport',TRUE,'USA',58,'Skates, Stick','Indoor','High',FALSE),\n" +
                    "(60,'Ice Hockey','Stick Sport',TRUE,'Canada',59,'Stick, Skates','Indoor','High',TRUE),\n" +
                    "(61,'Biathlon','Winter Sport',FALSE,'Norway',61,'Skis, Rifle','Outdoor','High',TRUE),\n" +
                    "(62,'Curling','Winter Sport',FALSE,'Scotland',62,'Stones','Indoor','Low',TRUE),\n" +
                    "(63,'Figure Skating','Artistic Sport',FALSE,'USA',63,'Skates','Indoor','Low',TRUE),\n" +
                    "(64,'Speed Skating','Racing Sport',FALSE,'USA',64,'Skates','Indoor','Medium',TRUE),\n" +
                    "(65,'Bodybuilding','Strength Sport',FALSE,'Greece',65,'Weights','Indoor','Low',FALSE),\n" +
                    "(66,'Powerlifting','Strength Sport',FALSE,'USA',66,'Barbell','Indoor','High',FALSE),\n" +
                    "(67,'CrossFit','Fitness Sport',FALSE,'USA',67,'Various','Indoor','High',FALSE),\n" +
                    "(68,'Parkour','Extreme Sport',FALSE,'France',68,'None','Outdoor','Medium',FALSE),\n" +
                    "(69,'Esports','Electronic',FALSE,'South Korea',69,'Computer','Indoor','Low',FALSE),\n" +
                    "(70,'Bow Hunting','Precision Sport',FALSE,'Various',70,'Bow','Outdoor','High',FALSE),\n" +
                    "(71,'Darts','Precision Sport',FALSE,'England',71,'Dartboard','Indoor','Low',FALSE),\n" +
                    "(72,'Airsoft','Combat Sport',TRUE,'Japan',72,'Airsoft Gun','Outdoor','High',FALSE),\n" +
                    "(73,'Paintball','Combat Sport',TRUE,'USA',73,'Paintball Gun','Outdoor','High',FALSE),\n" +
                    "(74,'Paddleboarding','Water Sport',FALSE,'Hawaii',74,'Board','Outdoor','Medium',FALSE),\n" +
                    "(75,'Kite Surfing','Water Sport',FALSE,'Hawaii',75,'Board, Kite','Outdoor','High',FALSE);\n";

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
