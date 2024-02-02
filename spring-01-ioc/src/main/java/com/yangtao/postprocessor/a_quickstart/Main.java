package com.yangtao.postprocessor.a_quickstart;

import com.yangtao.postprocessor.a_quickstart.bean.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            "com.yangtao.postprocessor.a_quickstart");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println("dog = " + dog);
    }

}
