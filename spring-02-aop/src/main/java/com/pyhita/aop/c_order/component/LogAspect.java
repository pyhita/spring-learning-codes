package com.pyhita.aop.c_order.component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Component
@Aspect
@Order(0)
public class LogAspect {

    @Before("@annotation(com.pyhita.aop.c_order.component.Log)")
    public void before() {
        System.out.println("log before .... ");
    }
}
