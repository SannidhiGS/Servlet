package com.xworkz.cattle.dao;

public enum DBConstant
{
    URL("jdbc:mysql://localhost:3306/cattle_db"),
    User("root"),
    Password("Sannidhi@123");
    final String value;
    DBConstant(String value){
        this.value=value;
    };

    public String getValue() {
        return value;
    }
}

