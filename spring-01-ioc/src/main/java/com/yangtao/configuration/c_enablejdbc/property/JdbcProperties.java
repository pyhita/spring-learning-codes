package com.yangtao.configuration.c_enablejdbc.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Component
@Data
public class JdbcProperties {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
}
