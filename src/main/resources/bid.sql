--creating the database
create database file;
use file;
--creating the table
Create table player(
id int primary key auto_increment,
name varchar(100) not null,
age int not null,
player_type varchar(50),
state varchar(50),
batting_avg double,
bowling_avg double,
no_of_stumps int
);
--selecting  the table
select * from player;

--creating the team table
CREATE TABLE team (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    email VARCHAR(100) UNIQUE
);

--inserting name and email values inside the team table
INSERT INTO team (name, email) VALUES
('RCB','rcb@gmail.com'),
('CSK','csk@gmail.com'),
('MI','mi@gmail.com'),
('KKR','kkr@gmail.com'),
('RR','rr@gmail.com'),
('SRH','srh@gmail.com'),
('DC','dc@gmail.com'),
('PBKS','pbks@gmail.com'),
('GT','gt@gmail.com'),
('LSG','lsg@gmail.com');