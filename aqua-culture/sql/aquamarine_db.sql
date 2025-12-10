create database aquamarine_db;
use aquamarine_db;

USE aquamarine_db;

CREATE TABLE marine(
    id INT PRIMARY KEY AUTO_INCREMENT,
    owner VARCHAR(50) NOT NULL,
    fish_type VARCHAR(30) NOT NULL,
    pond_size DECIMAL(10,2),
    quantity INT,
    location VARCHAR(100),
    phone VARCHAR(15)
);
select * from marine;