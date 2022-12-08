package com.yang.service;

import com.yang.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
    }
}
