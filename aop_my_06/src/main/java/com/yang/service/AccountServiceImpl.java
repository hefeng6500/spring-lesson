package com.yang.service;

import com.yang.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out,money);
        accountDao.inMoney(in,money);
    }
}
