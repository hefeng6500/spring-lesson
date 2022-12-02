package com.yang.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDaoImpl bookDao = (BookDaoImpl) ctx.getBean("bookDao");
        bookDao.save();
    }
}
