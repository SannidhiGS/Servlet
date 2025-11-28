package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PresidentMain {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/president_db";
        String user = "root";
        String password = "Sannidhi@123";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            System.out.println("Connection established successfully");


            String sqlInsert = "INSERT INTO president " +
                    "(president_id, first_name, last_name, country, term_start, term_end, party, birth_year, death_year, age_at_inauguration, age_at_death, spouse, children_count, education, previous_position, notable_achievement) VALUES " +
                    "(1,'James','Madison','USA',1809,1817,'Democratic-Republican',1751,1836,58,85,'Dolley Madison',2,'Princeton','Secretary of State','War of 1812')," +
                    "(2,'Abraham','Lincoln','USA',1861,1865,'Republican',1809,1865,52,56,'Mary Todd Lincoln',4,'Self-taught','Lawyer','Emancipation Proclamation')," +
                    "(3,'Theodore','Roosevelt','USA',1901,1909,'Republican',1858,1919,42,60,'Edith Roosevelt',6,'Harvard','Governor of NY','Panama Canal')," +
                    "(4,'Franklin','Roosevelt','USA',1933,1945,'Democratic',1882,1945,51,63,'Eleanor Roosevelt',6,'Harvard','Governor of NY','New Deal')," +
                    "(5,'John','Kennedy','USA',1961,1963,'Democratic',1917,1963,43,46,'Jacqueline Kennedy',4,'Harvard','Senator','Cuban Missile Crisis')," +
                    "(6,'Richard','Nixon','USA',1969,1974,'Republican',1913,1994,56,81,'Pat Nixon',2,'Duke','Vice President','Foreign Policy')," +
                    "(7,'Jimmy','Carter','USA',1977,1981,'Democratic',1924,NULL,52,NULL,'Rosalynn Carter',4,'Naval Academy','Governor of GA','Camp David Accords')," +
                    "(8,'Ronald','Reagan','USA',1981,1989,'Republican',1911,2004,70,93,'Nancy Reagan',4,'Eureka College','Governor of CA','End of Cold War')," +
                    "(9,'George','Bush','USA',1989,1993,'Republican',1924,2018,64,94,'Barbara Bush',6,'Yale','Vice President','Gulf War')," +
                    "(10,'Bill','Clinton','USA',1993,2001,'Democratic',1946,NULL,46,NULL,'Hillary Clinton',1,'Georgetown','Governor of AR','Economic Growth')," +
                    "(11,'George','W. Bush','USA',2001,2009,'Republican',1946,NULL,54,NULL,'Laura Bush',2,'Yale','Governor of TX','9/11 Response')," +
                    "(12,'Barack','Obama','USA',2009,2017,'Democratic',1961,NULL,47,NULL,'Michelle Obama',2,'Columbia','Senator','Affordable Care Act')," +
                    "(13,'Donald','Trump','USA',2017,2021,'Republican',1946,NULL,70,NULL,'Melania Trump',1,'Wharton','Businessman','Tax Reform')," +
                    "(14,'Joe','Biden','USA',2021,2025,'Democratic',1942,NULL,78,NULL,'Jill Biden',4,'University of Delaware','Vice President','COVID Response')," +
                    "(15,'Nelson','Mandela','South Africa',1994,1999,'African National Congress',1918,2013,76,95,'Winnie Mandela',6,'University of Fort Hare','Lawyer','End of Apartheid')," +
                    "(16,'Thabo','Mbeki','South Africa',1999,2008,'African National Congress',1942,NULL,57,NULL,'Zanele Mbeki',3,'University of London','Deputy President','Economic Reform')," +
                    "(17,'Cyril','Ramaphosa','South Africa',2018,NULL,'African National Congress',1952,NULL,66,NULL,'Tshepo Ramaphosa',5,'University of South Africa','Businessman','Anti-corruption')," +
                    "(18,'Winston','Churchill','UK',1940,1945,'Conservative',1874,1965,66,90,'Clementine Churchill',5,'Sandhurst','MP','WWII Leadership')," +
                    "(19,'Margaret','Thatcher','UK',1979,1990,'Conservative',1925,2013,54,87,'Denis Thatcher',2,'Somerville College','MP','Economic Policy')," +
                    "(20,'Tony','Blair','UK',1997,2007,'Labour',1953,NULL,44,NULL,'Cherie Blair',4,'Oxford','MP','Northern Ireland Peace Process')," +
                    "(21,'David','Cameron','UK',2010,2016,'Conservative',1966,NULL,44,NULL,'Samantha Cameron',4,'Oxford','MP','Brexit Referendum')," +
                    "(22,'Boris','Johnson','UK',2019,2022,'Conservative',1964,NULL,55,NULL,'Carrie Symonds',2,'Oxford','MP','COVID-19 Response')," +
                    "(23,'Emmanuel','Macron','France',2017,NULL,'La République En Marche!',1977,NULL,39,NULL,'Brigitte Macron',3,'Paris Nanterre','Economist','Labor Reform')," +
                    "(24,'Charles','De Gaulle','France',1959,1969,'RPF',1890,1970,69,80,'Yvonne de Gaulle',3,'Saint-Cyr','General','Founding Fifth Republic')," +
                    "(25,'Jacques','Chirac','France',1995,2007,'RPR',1932,2019,63,86,'Bernadette Chirac',2,'Sciences Po','Mayor','Economic Policies')," +
                    "(26,'Angela','Merkel','Germany',2005,2021,'CDU',1954,NULL,51,NULL,'Joachim Sauer',0,'University of Leipzig','Physicist','Eurozone Stability')," +
                    "(27,'Frank-Walter','Steinmeier','Germany',2017,NULL,'SPD',1956,NULL,61,NULL,'Elke Büdenbender',2,'University of Giessen','Minister','European Policy')," +
                    "(28,'Konrad','Adenauer','Germany',1949,1963,'CDU',1876,1967,73,91,'Emma Adenauer',4,'University of Freiburg','Mayor','Reconstruction Post-WWII')," +
                    "(29,'Vladimir','Putin','Russia',2000,2008,'United Russia',1952,NULL,48,NULL,'Lyudmila Putina',2,'Leningrad State University','KGB Officer','Political Reforms')," +
                    "(30,'Dmitry','Medvedev','Russia',2008,2012,'United Russia',1965,NULL,43,NULL,'Svetlana Medvedeva',1,'Leningrad State University','Lawyer','Modernization Projects')," +
                    "(31,'Boris','Yeltsin','Russia',1991,1999,'Independent',1931,2007,60,76,'Naina Yeltsina',2,'Ural State University','Party Leader','Soviet Collapse')," +
                    "(32,'Xi','Jinping','China',2013,NULL,'Communist Party',1953,NULL,60,NULL,'Peng Liyuan',1,'Tsinghua University','Vice President','Anti-corruption')," +
                    "(33,'Hu','Jintao','China',2003,2013,'Communist Party',1942,NULL,61,NULL,'Liu Yongqing',2,'Tsinghua University','Vice President','Economic Growth')," +
                    "(34,'Mao','Zedong','China',1949,1976,'Communist Party',1893,1976,56,83,'Jiang Qing',10,'Peking University','Revolutionary Leader','Founding PRC')," +
                    "(35,'Shinzo','Abe','Japan',2012,2020,'Liberal Democratic',1954,2022,57,67,'Akie Abe',2,'Seikei University','MP','Economic Reform')," +
                    "(36,'Yoshihide','Suga','Japan',2020,2021,'Liberal Democratic',1948,NULL,72,NULL,'Mariko Suga',3,'Hokkaido University','Chief Cabinet Secretary','COVID Response')," +
                    "(37,'Fumio','Kishida','Japan',2021,NULL,'Liberal Democratic',1957,NULL,64,NULL,'Yuko Kishida',3,'Waseda University','Minister','Economic Policy')," +
                    "(38,'Narendra','Modi','India',2014,NULL,'BJP',1950,NULL,63,NULL,'Jashodaben',2,'Delhi University','Chief Minister','Digital India')," +
                    "(39,'Pranab','Mukherjee','India',2012,2017,'INC',1935,2020,77,84,'Smt. Suvra Mukherjee',3,'University of Calcutta','Minister','Policy Reforms')," +
                    "(40,'Ram','Nath Kovind','India',2017,2022,'BJP',1945,NULL,72,NULL,'Savita Kovind',2,'University of Delhi','Governor','Legal Reforms')," +
                    "(41,'Manmohan','Singh','India',2004,2014,'INC',1932,NULL,72,NULL,'Gursharan Kaur',3,'Punjab University','Economist','Economic Reforms')," +
                    "(42,'Indira','Gandhi','India',1966,1977,'INC',1917,1984,49,66,'Feroze Gandhi',3,'Oxford','Prime Minister','Emergency Rule')," +
                    "(43,'Jawaharlal','Nehru','India',1947,1964,'INC',1889,1964,58,74,'Kamala Nehru',3,'Cambridge','Lawyer','Founding PM')," +
                    "(44,'George','Washington','USA',1789,1797,'Independent',1732,1799,57,67,'Martha Washington',2,'None','General','First US President')," +
                    "(45,'Thomas','Jefferson','USA',1801,1809,'Democratic-Republican',1743,1826,57,83,'Martha Jefferson',6,'College of William & Mary','Vice President','Louisiana Purchase')," +
                    "(46,'James','Monroe','USA',1817,1825,'Democratic-Republican',1758,1831,58,73,'Elizabeth Monroe',3,'College of William & Mary','Minister','Monroe Doctrine')," +
                    "(47,'John','Adams','USA',1797,1801,'Federalist',1735,1826,61,90,'Abigail Adams',4,'Harvard','Vice President','XYZ Reform')," +
                    "(48,'Grover','Cleveland','USA',1885,1889,'Democratic',1837,1908,47,71,'Frances Cleveland',3,'Princeton','Governor','Economic Policy')," +
                    "(49,'Woodrow','Wilson','USA',1913,1921,'Democratic',1856,1924,56,67,'Edith Wilson',3,'Princeton','Governor','League of Nations')," +
                    "(50,'Harry','Truman','USA',1945,1953,'Democratic',1884,1972,60,88,'Bess Truman',1,'Missouri State','Vice President','Marshall Plan')," +
                    "(51,'Dwight','Eisenhower','USA',1953,1961,'Republican',1890,1969,62,78,'Mamie Eisenhower',2,'West Point','General','Interstate Highway')," +
                    "(52,'John','F. Kennedy','USA',1961,1963,'Democratic',1917,1963,43,46,'Jacqueline Kennedy',4,'Harvard','Senator','Space Race')," +
                    "(53,'Lyndon','Johnson','USA',1963,1969,'Democratic',1908,1973,55,65,'Lady Bird Johnson',4,'Southwest Texas State','Senator','Civil Rights Act')," +
                    "(54,'Richard','Nixon','USA',1969,1974,'Republican',1913,1994,56,81,'Pat Nixon',2,'Duke','Vice President','Foreign Policy')," +
                    "(55,'Gerald','Ford','USA',1974,1977,'Republican',1913,2006,61,93,'Betty Ford',4,'University of Michigan','Congressman','Economic Stabilization')," +
                    "(56,'Jimmy','Carter','USA',1977,1981,'Democratic',1924,NULL,52,NULL,'Rosalynn Carter',4,'Naval Academy','Governor of GA','Camp David Accords')," +
                    "(57,'Ronald','Reagan','USA',1981,1989,'Republican',1911,2004,70,93,'Nancy Reagan',4,'Eureka College','Governor of CA','End of Cold War')," +
                    "(58,'George','H. W. Bush','USA',1989,1993,'Republican',1924,2018,64,94,'Barbara Bush',6,'Yale','Vice President','Gulf War')," +
                    "(59,'Bill','Clinton','USA',1993,2001,'Democratic',1946,NULL,46,NULL,'Hillary Clinton',1,'Georgetown','Governor of AR','Economic Growth')," +
                    "(60,'George','W. Bush','USA',2001,2009,'Republican',1946,NULL,54,NULL,'Laura Bush',2,'Yale','Governor of TX','9/11 Response')," +
                    "(61,'Barack','Obama','USA',2009,2017,'Democratic',1961,NULL,47,NULL,'Michelle Obama',2,'Columbia','Senator','Affordable Care Act')," +
                    "(62,'Donald','Trump','USA',2017,2021,'Republican',1946,NULL,70,NULL,'Melania Trump',1,'Wharton','Businessman','Tax Reform')," +
                    "(63,'Joe','Biden','USA',2021,NULL,'Democratic',1942,NULL,78,NULL,'Jill Biden',4,'University of Delaware','Vice President','COVID Response')," +
                    "(64,'Franklin','Pierce','USA',1853,1857,'Democratic',1804,1869,48,65,'Jane Pierce',3,'Bowdoin College','Lawyer','Expansion Policy')," +
                    "(65,'James','Buchanan','USA',1857,1861,'Democratic',1791,1868,65,77,'Mary Buchanan',2,'Dickinson College','Lawyer','Secession Crisis')," +
                    "(66,'Andrew','Johnson','USA',1865,1869,'Democratic',1808,1875,56,67,'Eliza McCardle','5','None','Vice President','Reconstruction')," +
                    "(67,'Ulysses','Grant','USA',1869,1877,'Republican',1822,1885,46,63,'Julia Grant',4,'West Point','General','Civil Rights')," +
                    "(68,'Rutherford','Hayes','USA',1877,1881,'Republican',1822,1893,54,71,'Lucy Hayes',8,'Kenyon College','Governor of OH','Reform Policy')," +
                    "(69,'James','Garfield','USA',1881,1881,'Republican',1831,1881,49,49,'Lucretia Garfield',7,'Williams College','Congressman','Education Reform')," +
                    "(70,'Chester','Arthur','USA',1881,1885,'Republican',1829,1886,52,57,'Ellen Arthur',3,'Union College','Vice President','Civil Service Reform')," +
                    "(71,'Grover','Cleveland','USA',1885,1889,'Democratic',1837,1908,47,71,'Frances Cleveland',3,'Princeton','Governor','Economic Policy')," +
                    "(72,'Benjamin','Harrison','USA',1889,1893,'Republican',1833,1901,55,68,'Caroline Harrison',3,'Miami University','Senator','Tariff Reform')," +
                    "(73,'William','McKinley','USA',1897,1901,'Republican',1843,1901,54,58,'Ida McKinley',2,'Allegheny College','Governor','Spanish-American War')," +
                    "(74,'Theodore','Roosevelt','USA',1901,1909,'Republican',1858,1919,42,60,'Edith Roosevelt',6,'Harvard','Governor of NY','Panama Canal')," +
                    "(75,'William','Taft','USA',1909,1913,'Republican',1857,1930,51,73,'Helen Taft',3,'Yale','Secretary of War','Trust-Busting');";


            int rowsInserted = statement.executeUpdate(sqlInsert);
            System.out.println("Rows inserted: " + rowsInserted);


            statement.executeUpdate("UPDATE president SET first_name='Jonathan' WHERE president_id=1");
            statement.executeUpdate("UPDATE president SET last_name='Doe-Smith' WHERE president_id=2");
            statement.executeUpdate("UPDATE president SET country='United States' WHERE president_id=3");
            statement.executeUpdate("UPDATE president SET party='Independent' WHERE president_id=4");
            System.out.println("Updated 4 columns successfully");


            int deletedById = statement.executeUpdate("DELETE FROM president WHERE president_id=5");
            System.out.println("Deleted by ID: " + deletedById);


            int deletedByCountry = statement.executeUpdate("DELETE FROM president WHERE country='Canada'");
            System.out.println("Deleted by country: " + deletedByCountry);
            connection.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
