package com.yangtao.basic_dl.b_by_type;

import com.yangtao.basic_dl.b_by_type.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/b_by_type.xml");
        Person bean = factory.getBean(Person.class);
        System.out.println("bean = " + bean);
    }

}
