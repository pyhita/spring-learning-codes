package com.yangtao.annotation.g_propertysource;

import com.yangtao.annotation.g_propertysource.bean.JdbcYmlProperty;
import com.yangtao.annotation.g_propertysource.config.JdbcYamlConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class JDBCApplication {

    public static void main(String[] args) {
        // ApplicationContext ctx = new AnnotationConfigApplicationContext(JDBCConfig.class);
        // JdbcProperties jdbcProperties = ctx.getBean(JdbcProperties.class);
        // System.out.println("jdbcProperties = " + jdbcProperties);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(
            JdbcYamlConfiguration.class);
        JdbcYmlProperty jdbcYmlProperty = ctx.getBean(JdbcYmlProperty.class);
        System.out.println("jdbcYmlProperty = " + jdbcYmlProperty);
    }

}
