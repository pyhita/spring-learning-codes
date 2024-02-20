package com.yangtao.basic_di.c_value_spel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Configuration
@ComponentScan("com.yangtao.basic_di.c_value_spel.bean")
@PropertySource(value = "classpath:basic_di/red.properties")
public class InjectConfig {

}
