package com.yang.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
    public String findName(int id) {
        System.out.println("id:"+id);
        return "yang";
    }
}
