Create database fuel_db;
use fuel_db;
CREATE TABLE fuel (
    id INT PRIMARY KEY AUTO_INCREMENT,
    station VARCHAR(100),
    type VARCHAR(50),
    quantity INT,
    price DOUBLE,
    barcode VARCHAR(100)
);

select * from fuel;
