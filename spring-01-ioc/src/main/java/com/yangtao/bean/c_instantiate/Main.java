package com.yangtao.bean.c_instantiate;

import com.yangtao.bean.c_instantiate.bean.Car;
import com.yangtao.bean.c_instantiate.config.InstantiateConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InstantiateConfig.class);
        Car car = (Car) ctx.getBean("car1");
        System.out.println("car = " + car);
    }

}
