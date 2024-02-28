package com.pyhita.proxy.a_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class JdkProxyTest {

    public static void main(String[] args) {

        // 1 新建target 对象
        UserServiceImpl userService = new UserServiceImpl();

        // 2 新建 InvocationHandler
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("log start: start to login");
                Object retVal = method.invoke(userService, args);
                System.out.println("log end: log end");
                return retVal;
            }
        };

        // 3 建立代理对象
        UseService userProxy = (UseService) Proxy.newProxyInstance(JdkProxyTest.class.getClassLoader(),
            userService.getClass().getInterfaces(), handler);
        userProxy.login("tom");

    }

}
