package com.yangtao.basic_dl.a_quick_start;

import com.yangtao.basic_dl.a_quick_start.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/a_quick_start.xml");
        // 通过Name 从IoC Container中获取Bean
        Person person = factory.getBean("person", Person.class);
        System.out.println("person = " + person);

    }

}
