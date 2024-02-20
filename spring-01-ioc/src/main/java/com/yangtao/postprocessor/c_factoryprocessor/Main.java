package com.yangtao.postprocessor.c_factoryprocessor;

import com.yangtao.postprocessor.c_factoryprocessor.bean.Blue;
import com.yangtao.postprocessor.c_factoryprocessor.bean.Green;
import com.yangtao.postprocessor.c_factoryprocessor.bean.Red;
import com.yangtao.postprocessor.c_factoryprocessor.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Red red = ctx.getBean(Red.class);
        System.out.println("red = " + red);
        Green green = ctx.getBean(Green.class);
        System.out.println("green = " + green);
        Blue blue = ctx.getBean(Blue.class);
        System.out.println("blue = " + blue);
    }
}
