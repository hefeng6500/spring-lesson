package com.yang.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("user dao is save...");
    }

    public void update() {
        System.out.println("user dao update...");
    }
}
