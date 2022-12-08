package com.yang.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
    }

    public void save() {
        System.out.println("book dao save ..." );
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory...");
    }

}
