package com.yangtao.bean.a_type;

import com.yangtao.bean.a_type.bean.Toy;
import com.yangtao.bean.a_type.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Main2 {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Toy toy = ctx.getBean(Toy.class);
        System.out.println("toy = " + toy);
    }

}
