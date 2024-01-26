package com.yangtao.lifecycle.a_initmethod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class XmlMain {

    public static void main(String[] args) {

        System.out.println("准备初始化IOC容器。。。");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/a_initmethod.xml");
        System.out.println("IOC容器初始化完成。。。");

        System.out.println();

        System.out.println("准备销毁IOC容器。。。");
        ctx.close();
        System.out.println("IOC容器销毁完成。。。");
    }

}
