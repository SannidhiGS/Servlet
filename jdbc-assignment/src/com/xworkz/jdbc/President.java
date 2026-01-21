package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class President {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/matrimony1";
        String username="root";
        String secret="Sannidhi@123";

        try {
            Connection connection = DriverManager.getConnection(url,username,secret);
            System.out.println("Connection"+connection);

            String query="INSERT INTO president (\n" +
                    "    president_id, first_name, last_name, country, term_start, term_end,\n" +
                    "    political_party, birth_date, birth_city, birth_country, approval_rating,\n" +
                    "    spouse_name, number_of_children, education, previous_position, is_incumbent\n" +
                    ") VALUES\n" +
                    "(1,'John','Merrick','USA',2000,2008,'Liberty Party','1950-01-12','Boston','USA',62,'Anna Merrick',3,'Harvard University','Governor',FALSE),\n" +
                    "(2,'Samuel','Grant','USA',2008,2016,'Progressive','1962-04-19','Chicago','USA',55,'Laura Grant',2,'Yale University','Senator',FALSE),\n" +
                    "(3,'Michael','Trent','USA',2016,2024,'Unity Party','1970-09-10','Denver','USA',50,'Rachel Trent',2,'MIT','Business Executive',FALSE),\n" +
                    "(4,'Daniel','Ross','USA',2024,2032,'Renewal Party','1978-03-22','Seattle','USA',61,'Elena Ross',1,'Stanford University','Governor',TRUE),\n" +
                    "(5,'Peter','Hamilton','Canada',1998,2005,'Liberal','1948-07-02','Toronto','Canada',60,'Marie Hamilton',2,'University of Toronto','Minister of Finance',FALSE),\n" +
                    "(6,'Richard','Bennett','Canada',2005,2013,'Conservative','1956-02-14','Ottawa','Canada',58,'Julia Bennett',3,'McGill University','Attorney General',FALSE),\n" +
                    "(7,'Lucas','Chambers','Canada',2013,2021,'Liberal','1964-11-30','Vancouver','Canada',57,'Clara Chambers',2,'University of British Columbia','Deputy PM',FALSE),\n" +
                    "(8,'Ethan','Rowe','Canada',2021,2029,'People’s Party','1972-12-15','Halifax','Canada',63,'Sophia Rowe',2,'McMaster University','Premier',TRUE),\n" +
                    "(9,'Carlos','Mendez','Mexico',1994,2000,'PRI','1940-06-21','Guadalajara','Mexico',52,'Isabel Mendez',4,'UNAM','Foreign Minister',FALSE),\n" +
                    "(10,'Miguel','Ortega','Mexico',2000,2006,'PAN','1954-03-14','Monterrey','Mexico',48,'Ana Ortega',2,'ITESM','Governor',FALSE),\n" +
                    "(11,'Jose','Vargas','Mexico',2006,2012,'PRD','1960-10-18','Puebla','Mexico',45,'Paula Vargas',3,'UNAM','Mayor',FALSE),\n" +
                    "(12,'Hector','Salazar','Mexico',2012,2018,'MORENA','1968-07-09','Tijuana','Mexico',59,'Lucia Salazar',2,'University of Guadalajara','Senator',FALSE),\n" +
                    "(13,'Raul','Medina','Mexico',2018,2024,'MORENA','1974-05-07','Merida','Mexico',56,'Maria Medina',1,'UNAM','Governor',FALSE),\n" +
                    "(14,'Luis','Santos','Brazil',1995,2002,'Workers Party','1945-02-12','Rio','Brazil',61,'Patricia Santos',4,'USP','Union Leader',FALSE),\n" +
                    "(15,'Antonio','Gomes','Brazil',2002,2010,'Social Democratic','1953-11-02','São Paulo','Brazil',58,'Larissa Gomes',2,'USP','Minister of Justice',FALSE),\n" +
                    "(16,'Ricardo','Vieira','Brazil',2010,2018,'Workers Party','1965-09-22','Salvador','Brazil',54,'Fernanda Vieira',3,'University of Brasília','Governor',FALSE),\n" +
                    "(17,'Diego','Alves','Brazil',2018,2026,'Alliance Party','1972-04-28','Fortaleza','Brazil',63,'Natalia Alves',2,'University of Rio','Military General',TRUE),\n" +
                    "(18,'Jean','Durand','France',1997,2004,'Socialist','1947-08-18','Paris','France',52,'Amelie Durand',2,'Sorbonne','Finance Minister',FALSE),\n" +
                    "(19,'Louis','Girard','France',2004,2012,'Republican','1954-01-21','Lyon','France',55,'Camille Girard',1,'Sciences Po','Governor',FALSE),\n" +
                    "(20,'Marc','Lefevre','France',2012,2020,'Independent','1962-05-30','Nice','France',57,'Juliette Lefevre',3,'University of Paris','Mayor',FALSE),\n" +
                    "(21,'Andre','Moreau','France',2020,2028,'Republican','1970-10-12','Marseille','France',60,'Sophie Moreau',2,'Sorbonne','Minister of Defense',TRUE),\n" +
                    "(22,'Klaus','Becker','Germany',1998,2006,'CDU','1950-06-18','Berlin','Germany',53,'Monika Becker',2,'Humboldt University','Defense Minister',FALSE),\n" +
                    "(23,'Hans','Schmidt','Germany',2006,2014,'SPD','1958-09-01','Hamburg','Germany',56,'Greta Schmidt',3,'University of Munich','Interior Minister',FALSE),\n" +
                    "(24,'Karl','Richter','Germany',2014,2022,'Greens','1964-03-14','Frankfurt','Germany',58,'Ursula Richter',1,'TU Berlin','Mayor',FALSE),\n" +
                    "(25,'Tobias','Weber','Germany',2022,2030,'SPD','1972-08-25','Cologne','Germany',62,'Lena Weber',2,'University of Heidelberg','Deputy PM',TRUE),\n" +
                    "(26,'Ivan','Morozov','Russia',1991,1999,'Independent','1941-01-09','Moscow','Russia',44,'Olga Morozov',2,'MSU','Intelligence Officer',FALSE),\n" +
                    "(27,'Sergei','Petrov','Russia',1999,2007,'United Russia','1953-12-11','Saint Petersburg','Russia',49,'Irina Petrov',1,'Moscow State','Deputy Minister',FALSE),\n" +
                    "(28,'Viktor','Romanov','Russia',2007,2015,'United Russia','1960-07-30','Kazan','Russia',51,'Tatiana Romanov',3,'Saint Petersburg Univ','Prime Minister',FALSE),\n" +
                    "(29,'Alexei','Sokolov','Russia',2015,2023,'Independent','1968-04-17','Novosibirsk','Russia',50,'Ekaterina Sokolov',2,'MSU','Military Commander',FALSE),\n" +
                    "(30,'Nikolai','Volkov','Russia',2023,2031,'United Russia','1975-10-02','Sochi','Russia',57,'Alena Volkov',1,'MSU','Governor',TRUE),\n" +
                    "(31,'Chen','Wei','China',1996,2002,'Communist Party','1946-05-09','Beijing','China',67,'Li Wei',1,'Tsinghua University','Provincial Leader',FALSE),\n" +
                    "(32,'Liu','Zhang','China',2002,2010,'Communist Party','1955-03-11','Shanghai','China',64,'Mei Zhang',2,'Peking University','Minister of Trade',FALSE),\n" +
                    "(33,'Hao','Li','China',2010,2018,'Communist Party','1963-09-20','Guangzhou','China',66,'Yuan Li',1,'Fudan University','Deputy Premier',FALSE),\n" +
                    "(34,'Jun','Feng','China',2018,2026,'Communist Party','1971-07-25','Chengdu','China',70,'Wei Feng',2,'Tsinghua University','Premier',TRUE),\n" +
                    "(35,'Yoshi','Tanaka','Japan',1994,2001,'LDP','1944-01-17','Tokyo','Japan',60,'Aiko Tanaka',2,'University of Tokyo','Finance Minister',FALSE),\n" +
                    "(36,'Hiro','Nakamura','Japan',2001,2009,'Democratic','1952-10-03','Osaka','Japan',57,'Kaori Nakamura',3,'Kyoto University','Governor',FALSE),\n" +
                    "(37,'Satoshi','Hayashi','Japan',2009,2017,'LDP','1960-04-12','Nagoya','Japan',59,'Miyu Hayashi',1,'Waseda University','Defense Minister',FALSE),\n" +
                    "(38,'Taro','Ishikawa','Japan',2017,2025,'LDP','1968-12-22','Sapporo','Japan',63,'Hina Ishikawa',2,'University of Tokyo','Chief Cabinet Secretary',TRUE),\n" +
                    "(39,'Aiden','Clark','Australia',1998,2006,'Labor','1950-03-28','Sydney','Australia',54,'Emma Clark',3,'University of Sydney','Deputy PM',FALSE),\n" +
                    "(40,'Liam','Hughes','Australia',2006,2014,'Liberal','1958-07-05','Melbourne','Australia',56,'Grace Hughes',2,'ANU','Treasurer',FALSE),\n" +
                    "(41,'Noah','Reed','Australia',2014,2022,'Labor','1967-02-10','Brisbane','Australia',58,'Lucy Reed',1,'University of Queensland','Defense Minister',FALSE),\n" +
                    "(42,'Evan','Brooks','Australia',2022,2030,'Liberal','1975-11-14','Perth','Australia',61,'Ella Brooks',2,'Monash University','Foreign Minister',TRUE),\n" +
                    "(43,'Omar','Saeed','Egypt',1999,2007,'National Party','1950-06-01','Cairo','Egypt',48,'Nadia Saeed',4,'Cairo University','General',FALSE),\n" +
                    "(44,'Hassan','Mahmoud','Egypt',2007,2015,'Justice Party','1956-09-17','Alexandria','Egypt',50,'Aisha Mahmoud',3,'AUC','Minister of Interior',FALSE),\n" +
                    "(45,'Adel','Khalid','Egypt',2015,2023,'Unity Party','1963-01-25','Giza','Egypt',52,'Farah Khalid',2,'Cairo University','Prime Minister',FALSE),\n" +
                    "(46,'Zaid','Rahman','Egypt',2023,2031,'National Party','1970-04-03','Luxor','Egypt',55,'Hala Rahman',1,'Cairo University','Governor',TRUE),\n" +
                    "(47,'Tariq','Khan','Pakistan',1997,2004,'People’s Party','1947-05-13','Karachi','Pakistan',46,'Sadia Khan',3,'Karachi University','Senator',FALSE),\n" +
                    "(48,'Imran','Sheikh','Pakistan',2004,2012,'Justice Party','1956-12-28','Lahore','Pakistan',49,'Mariam Sheikh',2,'LUMS','Governor',FALSE),\n" +
                    "(49,'Farhan','Zahir','Pakistan',2012,2020,'Unity Party','1965-03-05','Islamabad','Pakistan',51,'Noor Zahir',2,'University of Punjab','Foreign Minister',FALSE),\n" +
                    "(50,'Rashid','Masood','Pakistan',2020,2028,'People’s Party','1973-09-09','Rawalpindi','Pakistan',57,'Amina Masood',1,'Karachi University','Defense Minister',TRUE),\n" +
                    "(51,'Henry','Coleman','UK',1995,2000,'Conservative','1945-07-04','London','UK',55,'Emily Coleman',2,'Oxford University','MP',FALSE),\n" +
                    "(52,'James','Bennett','UK',2000,2008,'Labour','1954-02-11','Birmingham','UK',58,'Sarah Bennett',3,'Cambridge','Chancellor',FALSE),\n" +
                    "(53,'Oliver','Parker','UK',2008,2016,'Conservative','1960-10-05','Manchester','UK',56,'Rebecca Parker',1,'LSE','Home Secretary',FALSE),\n" +
                    "(54,'William','Adams','UK',2016,2024,'Labour','1968-08-22','Liverpool','UK',60,'Holly Adams',2,'Oxford University','Foreign Secretary',FALSE),\n" +
                    "(55,'Ethan','Knight','UK',2024,2032,'Conservative','1976-01-30','Leeds','UK',63,'Samantha Knight',2,'Cambridge','Defense Minister',TRUE),\n" +
                    "(56,'Mario','Rossi','Italy',1996,2001,'Democratic','1946-05-14','Rome','Italy',52,'Giulia Rossi',3,'Sapienza University','Minister of Finance',FALSE),\n" +
                    "(57,'Stefano','Conti','Italy',2001,2009,'Liberal','1955-02-19','Milan','Italy',55,'Isabella Conti',2,'Bocconi University','Governor',FALSE),\n" +
                    "(58,'Giovanni','Ferrari','Italy',2009,2017,'Democratic','1963-09-09','Naples','Italy',58,'Alessia Ferrari',2,'University of Florence','Senator',FALSE),\n" +
                    "(59,'Marco','Gallo','Italy',2017,2025,'People’s Party','1971-07-12','Turin','Italy',60,'Chiara Gallo',1,'Sapienza University','Mayor',TRUE),\n" +
                    "(60,'Pedro','Silva','Portugal',1998,2006,'Socialist','1950-03-08','Lisbon','Portugal',54,'Paula Silva',3,'University of Lisbon','Minister of Economy',FALSE),\n" +
                    "(61,'Ricardo','Sousa','Portugal',2006,2014,'Democratic','1958-06-24','Porto','Portugal',57,'Ana Sousa',2,'Coimbra University','Finance Minister',FALSE),\n" +
                    "(62,'Hugo','Moura','Portugal',2014,2022,'Socialist','1966-04-16','Braga','Portugal',59,'Ines Moura',1,'University of Lisbon','Governor',FALSE),\n" +
                    "(63,'Vasco','Lopes','Portugal',2022,2030,'Centrist','1974-11-01','Faro','Portugal',62,'Teresa Lopes',2,'Coimbra University','Minister of Defense',TRUE),\n" +
                    "(64,'David','Kim','South Korea',1997,2003,'Democratic','1947-09-15','Seoul','South Korea',50,'Min Kim',2,'Seoul National University','Mayor',FALSE),\n" +
                    "(65,'Jin','Park','South Korea',2003,2011,'Conservative','1956-12-02','Busan','South Korea',53,'Hye Park',3,'Yonsei University','Minister of Trade',FALSE),\n" +
                    "(66,'Sung','Lee','South Korea',2011,2019,'Democratic','1964-06-20','Incheon','South Korea',57,'Jae Lee',1,'Korea University','Deputy PM',FALSE),\n" +
                    "(67,'Minho','Choi','South Korea',2019,2027,'People’s Party','1973-04-14','Daegu','South Korea',60,'Sora Choi',2,'Seoul National University','Governor',TRUE),\n" +
                    "(68,'Abdul','Rahim','UAE',1995,2004,'Royal Council','1945-11-10','Dubai','UAE',64,'Aisha Rahim',4,'NYU Abu Dhabi','Minister of Energy',FALSE),\n" +
                    "(69,'Hamad','Al-Nouri','UAE',2004,2012,'Royal Council','1954-08-02','Abu Dhabi','UAE',66,'Fatima Al-Nouri',3,'Sorbonne AD','Defense Minister',FALSE),\n" +
                    "(70,'Faisal','Al-Maktoum','UAE',2012,2020,'Royal Council','1962-01-29','Sharjah','UAE',68,'Zaina Al-Maktoum',2,'Sharjah University','Prime Minister',FALSE),\n" +
                    "(71,'Sultan','Al-Rashid','UAE',2020,2028,'Royal Council','1970-05-16','Dubai','UAE',70,'Rasha Al-Rashid',1,'UAE University','Crown Prince',TRUE),\n" +
                    "(72,'Ahmed','Karim','Iraq',2004,2011,'National Alliance','1956-06-05','Baghdad','Iraq',48,'Hana Karim',3,'Baghdad University','General',FALSE),\n" +
                    "(73,'Othman','Hussein','Iraq',2011,2018,'Reform Party','1964-03-27','Mosul','Iraq',50,'Dalia Hussein',2,'Mosul University','Defense Minister',FALSE),\n" +
                    "(74,'Yasir','Qasim','Iraq',2018,2026,'Unity Front','1973-10-08','Basra','Iraq',52,'Lina Qasim',1,'Basra University','Governor',TRUE),\n" +
                    "(75,'Ali','Rahman','Iraq',2026,2034,'National Alliance','1981-09-21','Baghdad','Iraq',55,'Sara Rahman',2,'Baghdad University','Minister of Interior',TRUE);";

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
