package com.yang.service;

import com.yang.dao.BookDao;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao){
        this.bookDao =bookDao;
    }
    public void save(){
        bookDao.save();
        System.out.println("book service is save ...");
    }
}
