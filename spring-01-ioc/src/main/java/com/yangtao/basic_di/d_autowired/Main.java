package com.yangtao.basic_di.d_autowired;

import com.yangtao.basic_di.d_autowired.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.basic_di.d_autowired.bean");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println("dog = " + dog);

    }

}
