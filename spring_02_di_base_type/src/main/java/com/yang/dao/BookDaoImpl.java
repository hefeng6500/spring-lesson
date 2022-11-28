package com.yang.dao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int connectionNum;


    public String getDatabaseName() {
        return databaseName;
    }

    public int getConnectionNum() {
        return connectionNum;
    }


    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    public void save() {
        System.out.println("book dao is save..." + databaseName + ", " + connectionNum);
    }


}
