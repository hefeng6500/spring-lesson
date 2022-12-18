package com.yang.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println("book dao save...");
    }

    public void update(){
//        System.out.println("book dao update...");
        int a = 10;
        int b = 0;
        b = a / b;
    }
}
