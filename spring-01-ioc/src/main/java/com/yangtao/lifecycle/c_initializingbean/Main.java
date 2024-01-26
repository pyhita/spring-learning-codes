package com.yangtao.lifecycle.c_initializingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.lifecycle.c_initializingbean.bean");
        System.out.println("IOC容器初始化完成。。。");
        System.out.println();
        System.out.println("准备销毁IOC容器。。。");
        ctx.close();
        System.out.println("IOC容器销毁完成。。。");
    }

}
