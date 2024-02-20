package com.yangtao.environment;

import com.yangtao.environment.bean.EnvironmentHolder;
import com.yangtao.environment.configuration.EnvironmentConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class EnvironmentApplication {
    public static void main(String[] args) {
        // ApplicationContext ctx = new AnnotationConfigApplicationContext(
        //     "com.yangtao.environment.bean");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            EnvironmentConfiguration.class);
        EnvironmentHolder holder = ctx.getBean(EnvironmentHolder.class);
        holder.printEnv();
    }

}
