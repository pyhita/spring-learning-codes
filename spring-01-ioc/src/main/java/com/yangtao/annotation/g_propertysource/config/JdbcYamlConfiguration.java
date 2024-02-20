package com.yangtao.annotation.g_propertysource.config;

import com.yangtao.annotation.g_propertysource.bean.JdbcYmlProperty;
import com.yangtao.annotation.g_propertysource.factory.YamlPropertySourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Configuration
@PropertySource(
    value = "classpath:propertysource/jdbc.yaml",
    factory = YamlPropertySourceFactory.class
)
public class JdbcYamlConfiguration {

    @Bean
    public JdbcYmlProperty jdbcYmlProperty() {
        return new JdbcYmlProperty();
    }
}
