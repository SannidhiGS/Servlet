package com.xworkz.fuel.dao;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/fuel_db"),
    USER("root"),
    PASSWORD("Sannidhi@123");
    String value;
    DBConstant(String value){
        this.value=value;
    }
    public String getValue() {
        return value;
    }

}
