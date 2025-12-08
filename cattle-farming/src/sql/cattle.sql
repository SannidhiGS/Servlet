create database cattle_db;
use cattle_db;
CREATE TABLE cattle (
    id INT PRIMARY KEY AUTO_INCREMENT,
    owner VARCHAR(50),
    type VARCHAR(50),
    age INT,
    weight DOUBLE,
    location VARCHAR(50),
    phone BIGINT
);
Select * from cattle;