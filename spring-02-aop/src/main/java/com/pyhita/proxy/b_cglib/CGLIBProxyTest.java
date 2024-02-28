package com.pyhita.proxy.b_cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class CGLIBProxyTest {

    public static void main(String[] args) {
        // 1 新建 target对象
        UserServcice userServcice = new UserServcice();

        // 2 Enhancer
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(CGLIBProxyTest.class.getClassLoader());
        enhancer.setSuperclass(userServcice.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects,
                MethodProxy methodProxy) throws Throwable {
                System.out.println("log start .... ");
                Object retVal = method.invoke(userServcice, objects);
                System.out.println("log end ... ");
                return retVal;
            }
        });

        UserServcice proxy = (UserServcice) enhancer.create();
        proxy.login("tom");
    }


}
