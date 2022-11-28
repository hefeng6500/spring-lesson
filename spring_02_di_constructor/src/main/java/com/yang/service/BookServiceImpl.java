package com.yang.service;

import com.yang.dao.BookDao;
import com.yang.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    private String count;

    public BookServiceImpl(BookDao bookDao, String count) {
        this.bookDao = bookDao;
        this.count = count;
    }

    public void save(){
        bookDao.save();
        System.out.println("book service is save ...");
        System.out.println("book service count is" + count);
    }
}
