package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalMain {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hospital_db?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "Sannidhi@123";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sqlInsert = "INSERT INTO hospital " +
                    "(hospital_id, name, city, country, established_year, bed_count, type, director, rating, specialty) VALUES " +
                    "(191,'City Care Hospital','New York','USA',1985,250,'General','Dr. Alice Smith',5,'Cardiology')," +
                    "(251,'Green Valley Clinic','Los Angeles','USA',1992,150,'Clinic','Dr. Bob Johnson',4,'Orthopedics');";
                   // "(3,'Sunrise Medical Center','Chicago','USA',1975,300,'General','Dr. Clara Davis',5,'Neurology')," +
//                    "(4,'Riverdale Hospital','Houston','USA',1988,200,'General','Dr. Daniel Brown',4,'Pediatrics')," +
//                    "(5,'Harmony Health','Philadelphia','USA',1995,180,'Clinic','Dr. Emma Wilson',3,'Dermatology')," +
//                    "(6,'Hope Medical','Phoenix','USA',2000,220,'General','Dr. Frank Lee',5,'Oncology')," +
//                    "(7,'Oakwood Hospital','San Antonio','USA',1982,260,'General','Dr. Grace Miller',4,'Cardiology')," +
//                    "(8,'Maple Leaf Clinic','San Diego','USA',1990,140,'Clinic','Dr. Henry Taylor',3,'ENT')," +
//                    "(9,'Silver Spring Hospital','Dallas','USA',1978,280,'General','Dr. Isabella Anderson',5,'Neurology')," +
//                    "(10,'Golden Gate Medical','San Jose','USA',1985,240,'General','Dr. Jack Thomas',4,'Orthopedics')," +
//                    "(11,'Pinecrest Hospital','Austin','USA',1987,230,'General','Dr. Karen White',4,'Pediatrics')," +
//                    "(12,'Lakeside Clinic','Jacksonville','USA',1991,160,'Clinic','Dr. Larry Harris',3,'Cardiology')," +
//                    "(13,'Mountain View Medical','Fort Worth','USA',1980,270,'General','Dr. Monica Clark',5,'Neurology')," +
//                    "(14,'Broadway Hospital','Columbus','USA',1983,210,'General','Dr. Nathan Scott',4,'Oncology')," +
//                    "(15,'Evergreen Health','Charlotte','USA',1994,190,'Clinic','Dr. Olivia Adams',3,'Orthopedics')," +
//                    "(16,'Sunset Hospital','San Francisco','USA',1986,250,'General','Dr. Paul Baker',5,'Cardiology')," +
//                    "(17,'Redwood Medical Center','Indianapolis','USA',1979,260,'General','Dr. Quinn Roberts',4,'ENT')," +
//                    "(18,'Cedar Valley Clinic','Seattle','USA',1993,150,'Clinic','Dr. Rachel Lewis',3,'Dermatology')," +
//                    "(19,'Maplewood Hospital','Denver','USA',1981,280,'General','Dr. Samuel Walker',5,'Neurology')," +
//                    "(20,'Blue Ridge Medical','Washington','USA',1989,240,'General','Dr. Tina Young',4,'Pediatrics')," +
//                    "(21,'Golden Oaks Hospital','Boston','USA',1990,230,'General','Dr. Ursula Hall',5,'Cardiology')," +
//                    "(22,'Silver Lake Clinic','Nashville','USA',1992,160,'Clinic','Dr. Victor Allen',3,'Orthopedics')," +
//                    "(23,'Prairie View Hospital','Baltimore','USA',1984,270,'General','Dr. Wendy King',4,'Neurology')," +
//                    "(24,'Valley Health','Louisville','USA',1986,210,'General','Dr. Xavier Scott',5,'Oncology')," +
//                    "(25,'Riverbend Medical','Portland','USA',1995,190,'Clinic','Dr. Yolanda Hughes',3,'Pediatrics')," +
//                    "(26,'Harborview Hospital','Oklahoma City','USA',1982,250,'General','Dr. Zachary Ward',4,'Cardiology')," +
//                    "(27,'Meadowbrook Clinic','Milwaukee','USA',1991,150,'Clinic','Dr. Amy Collins',3,'ENT')," +
//                    "(28,'Summit Medical Center','Albuquerque','USA',1977,280,'General','Dr. Brian Mitchell',5,'Neurology')," +
//                    "(29,'Hilltop Hospital','Tucson','USA',1980,240,'General','Dr. Cindy Perez',4,'Oncology')," +
//                    "(30,'Forest Health','Fresno','USA',1993,200,'Clinic','Dr. David Turner',3,'Orthopedics')," +
//                    "(31,'Willow Creek Hospital','Sacramento','USA',1985,260,'General','Dr. Ella Parker',5,'Cardiology')," +
//                    "(32,'Brookside Clinic','Kansas City','USA',1990,140,'Clinic','Dr. Frank Edwards',3,'Dermatology')," +
//                    "(33,'Parkview Medical','Mesa','USA',1981,270,'General','Dr. Gina Collins',4,'Neurology')," +
//                    "(34,'Lakeshore Hospital','Atlanta','USA',1988,210,'General','Dr. Harry Murphy',5,'Pediatrics')," +
//                    "(35,'Cypress Health','Omaha','USA',1994,180,'Clinic','Dr. Irene Rivera',3,'Cardiology')," +
//                    "(36,'Bayview Hospital','Colorado Springs','USA',1983,250,'General','Dr. Jason Long',4,'ENT')," +
//                    "(37,'Hillside Medical','Raleigh','USA',1979,260,'General','Dr. Kelly Howard',5,'Neurology')," +
//                    "(38,'Valley View Clinic','Miami','USA',1992,160,'Clinic','Dr. Liam Bennett',3,'Oncology')," +
//                    "(39,'Oak Ridge Hospital','Virginia Beach','USA',1980,280,'General','Dr. Maria Flores',4,'Pediatrics')," +
//                    "(40,'Sunrise Health','Minneapolis','USA',1986,240,'General','Dr. Nathaniel Stewart',5,'Cardiology')," +
//                    "(41,'Cedar Grove Hospital','Tulsa','USA',1985,230,'General','Dr. Olivia Morris',4,'Orthopedics')," +
//                    "(42,'Silver Birch Clinic','Arlington','USA',1991,150,'Clinic','Dr. Peter Rogers',3,'Dermatology')," +
//                    "(43,'Maple Ridge Medical','New Orleans','USA',1982,270,'General','Dr. Quinn Cook',5,'Neurology')," +
//                    "(44,'Riverfront Hospital','Wichita','USA',1984,210,'General','Dr. Rachel Morgan',4,'Oncology')," +
//                    "(45,'Lakeside Health','Cleveland','USA',1995,190,'Clinic','Dr. Samuel Bell',3,'Pediatrics')," +
//                    "(46,'Pine Hill Hospital','Tampa','USA',1983,250,'General','Dr. Tina Murphy',5,'Cardiology')," +
//                    "(47,'Golden Valley Clinic','Bakersfield','USA',1990,140,'Clinic','Dr. Ursula Perry',3,'ENT')," +
//                    "(48,'Brookfield Medical Center','Aurora','USA',1978,280,'General','Dr. Victor Stewart',4,'Neurology')," +
//                    "(49,'Highland Hospital','Anaheim','USA',1981,240,'General','Dr. Wendy Cooper',5,'Oncology')," +
//                    "(50,'Meadowlands Health','Santa Ana','USA',1993,200,'Clinic','Dr. Xavier Richardson',3,'Orthopedics')," +
//                    "(51,'Sunset Hospital','Riverside','USA',1985,260,'General','Dr. Yolanda Hughes',4,'Cardiology')," +
//                    "(52,'Valley Clinic','Corpus Christi','USA',1990,160,'Clinic','Dr. Zachary Bennett',3,'Dermatology')," +
//                    "(53,'Lakeshore Medical','Lexington','USA',1981,270,'General','Dr. Amy Foster',5,'Neurology')," +
//                    "(54,'Hillcrest Hospital','Stockton','USA',1988,210,'General','Dr. Brian Gonzalez',4,'Oncology')," +
//                    "(55,'Bay Area Health','Cincinnati','USA',1994,180,'Clinic','Dr. Cindy Simmons',3,'Pediatrics')," +
//                    "(56,'Pineview Hospital','St. Paul','USA',1983,250,'General','Dr. David Flores',5,'Cardiology')," +
//                    "(57,'Oakwood Clinic','Toledo','USA',1991,140,'Clinic','Dr. Ella Kelly',3,'ENT')," +
//                    "(58,'Riverside Medical','Greensboro','USA',1977,280,'General','Dr. Frank Howard',4,'Neurology')," +
//                    "(59,'Forest Hill Hospital','Newark','USA',1980,240,'General','Dr. Gina Bennett',5,'Oncology')," +
//                    "(60,'Maplewood Health','Plano','USA',1993,200,'Clinic','Dr. Harry Perry',3,'Orthopedics')," +
//                    "(61,'Silver Lake Hospital','Henderson','USA',1985,260,'General','Dr. Irene Jenkins',4,'Cardiology')," +
//                    "(62,'Harborview Clinic','Glendale','USA',1990,150,'Clinic','Dr. Jason Gray',3,'Dermatology')," +
//                    "(63,'Cedar Medical Center','Hialeah','USA',1982,270,'General','Dr. Kelly Hayes',5,'Neurology')," +
//                    "(64,'Mountainview Hospital','Salt Lake City','USA',1984,210,'General','Dr. Liam Powell',4,'Oncology')," +
//                    "(65,'Lakeside Health Center','Tallahassee','USA',1995,190,'Clinic','Dr. Maria Brooks',3,'Pediatrics')," +
//                    "(66,'Willowbrook Hospital','Huntsville','USA',1983,250,'General','Dr. Nathaniel Foster',5,'Cardiology')," +
//                    "(67,'Valleyview Clinic','Grand Rapids','USA',1990,140,'Clinic','Dr. Olivia Hughes',3,'ENT')," +
//                    "(68,'Oakdale Medical','Knoxville','USA',1978,280,'General','Dr. Peter Morgan',4,'Neurology')," +
//                    "(69,'Sunrise Hospital','Worcester','USA',1981,240,'General','Dr. Quinn Gray',5,'Oncology')," +
//                    "(70,'Pinecrest Health','Brownsville','USA',1993,200,'Clinic','Dr. Rachel Brooks',3,'Orthopedics')," +
//                    "(71,'Meadowbrook Hospital','Santa Clarita','USA',1985,260,'General','Dr. Samuel Foster',4,'Cardiology')," +
//                    "(72,'Silver Pines Clinic','Charleston','USA',1990,150,'Clinic','Dr. Tina Gray',3,'Dermatology')," +
//                    "(73,'Blue Sky Medical Center','Columbia','USA',1981,270,'General','Dr. Ursula Perry',5,'Neurology')," +
//                    "(74,'Rivergate Hospital','Denton','USA',1988,210,'General','Dr. Victor Simmons',4,'Oncology')," +
//                    "(75,'Sunset Health Center','Miami','USA',2005,150,'Clinic','Dr. Zoe King',4,'Pediatrics');";

            int rowsInserted = statement.executeUpdate(sqlInsert);
            System.out.println("Rows inserted: " + rowsInserted);

            statement.executeUpdate("UPDATE hospital SET rating=5 WHERE hospital_id=2");
            statement.executeUpdate("UPDATE hospital SET bed_count=350 WHERE hospital_id=3");
            statement.executeUpdate("UPDATE hospital SET director='Dr. Nathan Scott' WHERE hospital_id=4");
            statement.executeUpdate("UPDATE hospital SET specialty='Cardiology' WHERE hospital_id=5");

            int deletedById = statement.executeUpdate("DELETE FROM hospital WHERE hospital_id=1");
            int deletedByType = statement.executeUpdate("DELETE FROM hospital WHERE type='Clinic'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
