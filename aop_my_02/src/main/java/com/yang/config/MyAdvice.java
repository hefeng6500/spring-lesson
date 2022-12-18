package com.yang.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// 通知类
// 将通知类配给容器并标识其为切面类
@Component
@Aspect
public class MyAdvice {

//    第一个`ptx()`并没有被使用，所以不会被读取。
    @Pointcut("execution(void com.yang.dao.BookDao.save())")
    private void ptx(){}

    // 描述通知类和切入点的关系
    @Pointcut("execution(void com.yang.dao.BookDao.update())")
    private void pt(){};

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
