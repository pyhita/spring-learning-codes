package com.yangtao.basic_di.b_constructor;

import com.yangtao.basic_di.b_constructor.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/b_constructor.xml");
        Person bean = ctx.getBean(Person.class);
        System.out.println("bean = " + bean);
    }

}
