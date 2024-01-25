package com.yangtao.basic_dl.e_lazy_look_up;

import com.yangtao.basic_dl.e_lazy_look_up.bean.Cat;
import com.yangtao.basic_dl.e_lazy_look_up.bean.Dog;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/e_lazy_look_up.xml");
        Dog dog = ctx.getBean(Dog.class);
        // Cat cat = ctx.getBean(Cat.class);

        // 不是拿Bean 而是拿Provider
        ObjectProvider<Cat> catProvider = ctx.getBeanProvider(Cat.class);
        // 找不到的时候 返回null 而不是报错
        Cat cat = catProvider.getIfAvailable(Cat::new);
        System.out.println("cat = " + cat);
    }
}
