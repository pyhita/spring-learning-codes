package com.yangtao.basic_di.g_complexfield;

import com.yangtao.basic_di.g_complexfield.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class XmlMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/g_complexfield.xml");
        Person person = ctx.getBean(Person.class);
        System.out.println("person = " + person);

    }

}
