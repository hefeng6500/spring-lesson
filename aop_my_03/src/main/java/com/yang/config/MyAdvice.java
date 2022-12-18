package com.yang.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 通知类
// 将通知类配给容器并标识其为切面类
@Component
@Aspect
public class MyAdvice {


    @Pointcut("execution(void com.yang.dao.BookDao.update())")
    private void pt(){};

    @Before("pt()")
    public void before(){
        System.out.println("before advice...");
    }


    @After("pt()")
    public void after(){
        System.out.println("after advice...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        // 表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around after advice ...");

        return ret;
    }

    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
