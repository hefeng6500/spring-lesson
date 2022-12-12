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
    // 描述通知类和切入点的关系
    @Pointcut("execution(void com.yang.dao.BookDao.save())")
    private void pt(){}

    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
