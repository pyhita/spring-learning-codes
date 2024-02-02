package com.yangtao.postprocessor.b_factorybean;

import com.yangtao.postprocessor.b_factorybean.bean.Egg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.postprocessor.b_factorybean");
        Egg bean = ctx.getBean(Egg.class);
    }

}
