package com.xworkz.bid.dao.impl;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/file"),
    USER("root"),
    PASSWORD("Sannidhi@123");
    private String value;
    DBConstant(String value){
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
