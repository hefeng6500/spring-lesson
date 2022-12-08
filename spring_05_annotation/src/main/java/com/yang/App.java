package com.yang;

import com.yang.dao.BookDao;
import com.yang.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

//        BookServiceImpl类没有起名称，所以在App中是按照类型来获取bean对象
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();

//        @Component注解如果不起名称，会有一个默认值就是`当前类名首字母小写`，所以也可以按照名称获取，如
        BookService bookService2 = (BookService)ctx.getBean("bookServiceImpl");
        bookService2.save();
    }

}
