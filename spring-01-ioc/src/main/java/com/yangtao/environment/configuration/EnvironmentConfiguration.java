package com.yangtao.environment.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Configuration
@ComponentScan(value = "com.yangtao.environment.bean")
@PropertySource(value = "classpath:propertysource/jdbc.properties")
public class EnvironmentConfiguration {

}
