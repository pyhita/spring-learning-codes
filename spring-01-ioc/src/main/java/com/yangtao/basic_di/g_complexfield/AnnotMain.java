package com.yangtao.basic_di.g_complexfield;

import com.yangtao.basic_di.g_complexfield.bean.Person2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class AnnotMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.basic_di.g_complexfield.bean");
        Person2 person2 = ctx.getBean(Person2.class);
        System.out.println("person2 = " + person2);
    }

}
