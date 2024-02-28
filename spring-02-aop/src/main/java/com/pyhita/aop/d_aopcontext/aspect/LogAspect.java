package com.pyhita.aop.d_aopcontext.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Component
@Aspect
public class LogAspect {

    @Before("execution(* com.pyhita.aop.d_aopcontext.service.UserService.*(..))")
    public void beforePrint() {
        System.out.println("LogAspect 前置通知 ......");
    }
}