package com.yangtao.basic_di.h_aware;

import com.yangtao.basic_di.h_aware.bean.AwareTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class AwareMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.basic_di.h_aware.bean");
        AwareTest awareTest = ctx.getBean(AwareTest.class);
        System.out.println("awareTest = " + awareTest);
    }

}
