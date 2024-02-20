package com.yangtao.bean.a_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.bean.a_type.bean");
        // Toy toy = ctx.getBean(Toy.class);
        // System.out.println("toy = " + toy);
    }
}
