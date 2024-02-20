package com.yangtao.annotation.g_propertysource.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Component
@Data
public class JdbcYmlProperty {

    @Value("${yml.jdbc.url}")
    private String url;

    @Value("${yml.jdbc.driver-class-name}")
    private String driverClassName;

    @Value("${yml.jdbc.username}")
    private String username;

    @Value("${yml.jdbc.password}")
    private String password;

    // 省略getter setter toString
}
