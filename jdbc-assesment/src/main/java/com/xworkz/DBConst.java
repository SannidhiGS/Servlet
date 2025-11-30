package com.xworkz.jdbc;

public enum DBConst {
    URL("jdbc:mysql://localhost:3306/matrimony1"),
    Username("root"),
    Secret("Sindhu@478");

    private String property;

    DBConst(String property){
        this.property=property;
        System.out.println("running in DB constant");
    }

    public String getProperty() {
        return property;
    }
}