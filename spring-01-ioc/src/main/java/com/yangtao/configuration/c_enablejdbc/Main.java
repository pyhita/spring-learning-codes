package com.yangtao.configuration.c_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.yangtao.configuration.c_enablejdbc.annotation.EnableJdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Configuration
@EnableJdbc
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        DruidDataSource source = ctx.getBean(DruidDataSource.class);
        System.out.println(source.getUsername());
    }
}
