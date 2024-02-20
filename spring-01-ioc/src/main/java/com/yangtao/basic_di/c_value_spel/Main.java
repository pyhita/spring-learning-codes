package com.yangtao.basic_di.c_value_spel;

import com.yangtao.basic_di.c_value_spel.bean.Red;
import com.yangtao.basic_di.c_value_spel.config.InjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {

    public static void main(String[] args) {
        // ApplicationContext ctx = new AnnotationConfigApplicationContext(
        //     "com.yangtao.basic_di.c_value_spel.bean");
        //
        // Black bean = ctx.getBean(Black.class);
        // System.out.println("bean = " + bean);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectConfig.class);
        Red red = ctx.getBean(Red.class);
        System.out.println("red = " + red);
    }

}
