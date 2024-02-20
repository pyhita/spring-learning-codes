package com.yangtao.lifecycle.b_jsr250;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("准备初始化IOC容器。。。");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.lifecycle.b_jsr250.bean");
        System.out.println("IOC容器初始化完成。。。");
        System.out.println();
        System.out.println("准备销毁IOC容器。。。");
        ctx.close();
        System.out.println("IOC容器销毁完成。。。");
    }
}
