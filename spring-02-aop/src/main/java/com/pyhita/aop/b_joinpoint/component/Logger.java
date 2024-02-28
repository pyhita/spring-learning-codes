package com.pyhita.aop.b_joinpoint.component;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Aspect
@Component
public class Logger {

    @Before("execution(public * com.pyhita.aop.b_joinpoint.service.FinanceService.*(..))")
    public void beforePrint(JoinPoint joinPoint) {
        System.out.println("被拦截的类是： " + joinPoint.getTarget().getClass().getName());
        System.out.println("被拦截的方法是： " + (((MethodSignature)joinPoint.getSignature()).getMethod().getName()));
        System.out.println("被拦截的方法参数是： " + Arrays.toString(joinPoint.getArgs()));
        System.out.println("Logger beforePrint run ......");
    }

    //    @After("execution(* com.linkedbear.spring.aop.b_aspectj.service.*.*(String)))")
    @After("@annotation(com.pyhita.aop.b_joinpoint.component.Log)")
    public void afterPrint() {
        System.out.println("Logger afterPrint run ......");
    }

    @AfterReturning("execution(* com.pyhita.aop.a_aspectj.service.*.*(String)))")
    public void afterReturningPrint() {
        System.out.println("Logger afterReturningPrint run ......");
    }

    @AfterThrowing("defaultPointcut()")
    public void afterThrowingPrint() {
        System.out.println("Logger afterThrowingPrint run ......");
    }

    @Around("execution(public * com.pyhita.aop.b_joinpoint.service.FinanceService.addMoney(..))")
    public Object aroundPrint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Logger aroundPrint before run ......");
        try {
            Object retVal = joinPoint.proceed();
            System.out.println("Logger aroundPrint afterReturning run ......");
            return retVal;
        } catch (Throwable e) {
            System.out.println("Logger aroundPrint afterThrowing run ......");
            throw e;
        } finally {
            System.out.println("Logger aroundPrint after run ......");
        }
    }

    @Pointcut("execution(* com.pyhita.aop.b_joinpoint.service.*.*(String)))")
    public void defaultPointcut() {

    }
}