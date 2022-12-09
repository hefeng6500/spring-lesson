package com.yang.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.yang.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String userName;
    @Value("password")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao); // ==引用类型注入只需要为bean定义方法设置形参即可，容器会根据类型自动装配对象。==
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
