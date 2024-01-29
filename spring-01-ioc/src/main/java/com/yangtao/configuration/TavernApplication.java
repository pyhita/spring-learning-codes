package com.yangtao.configuration;

import com.yangtao.configuration.a_module.config.TavernConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class TavernApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfig.class);
        for (String definitionName : ctx.getBeanDefinitionNames()) {
            System.out.println("definitionName = " + definitionName);
        }
    }

}
