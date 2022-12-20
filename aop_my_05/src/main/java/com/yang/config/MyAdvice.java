package com.yang.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.yang.dao.BookDao.findName(..))")
    private void pt(){}

    @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println("前置通知获取参数：" + Arrays.toString(args));
        System.out.println("before advice ..." );
    }

    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        Object[] args = pjp.getArgs();
        System.out.println("环绕通知获取参数：" + Arrays.toString(args));

//        调用无参数的proceed，当原始方法有参数，会在调用的过程中自动传入参数
//        所以调用这两个方法的任意一个都可以完成功能
//        但是当需要修改原始方法的参数时，就只能采用带有参数的方法
//        有了这个特性后，我们就可以在环绕通知中对原始方法的参数进行拦截过滤，避免由于参数的问题导致程序无法正确运行，保证代码的健壮性。
        args[0] = 222;
        Object ret = pjp.proceed(args);
        System.out.println("环绕通知获取返回值： " + ret);
        return ret;
    }
    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(JoinPoint jp, Object ret) {
        System.out.println("afterReturning advice ..." + ret);
    }


    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice ...");
    }
}
