package com.yangtao.event.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("IoC 容器启动");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.event.a_quickstart.listener");
        System.out.println("IoC 容器启动完成");
        System.out.println("IoC 容器关闭");
        ctx.close();
        System.out.println("IoC 容器关闭完成");
    }
}
