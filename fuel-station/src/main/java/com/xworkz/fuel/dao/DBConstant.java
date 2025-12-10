package com.xworkz.fuel.dao;
import lombok.Getter;
@Getter
public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/fuel_db"),
    USER("root"),
    PASSWORD("Sannidhi@123");
    private final String value;
    DBConstant(String value){
        this.value=value;
    }
}
