package com.yang.service;

import com.yang.dao.BookDao;
import com.yang.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{

    public void save(){
        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.save();
        System.out.println("book service is save ...");
    }
}
