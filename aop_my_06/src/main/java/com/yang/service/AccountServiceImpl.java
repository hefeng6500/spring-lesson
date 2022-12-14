package com.yang.service;

import com.yang.dao.AccountDao;
import com.yang.service.log.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

//    Spring的事务只会对`Error异常`和`RuntimeException异常`及其子类进行事务回顾
//    此时就可以使用rollbackFor属性来设置出现IOException异常不回滚的问题
    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String out, String in, Double money) throws IOException {
        try{
            accountDao.outMoney(out,money);
            int i = 1/0; //这个异常事务会回滚
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }
    }
}
