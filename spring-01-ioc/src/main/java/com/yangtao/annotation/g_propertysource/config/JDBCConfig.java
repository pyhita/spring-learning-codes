package com.yangtao.annotation.g_propertysource.config;

import com.yangtao.annotation.g_propertysource.bean.JdbcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Configuration
@PropertySource(value = "propertysource/jdbc.properties")
public class JDBCConfig {
    @Bean
    public JdbcProperties jdbcProperties() {
        return new JdbcProperties();
    }

}
