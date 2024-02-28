package com.yangtao.config;

import com.yangtao.entity.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yangtao.service")
@ComponentScan("com.yangtao.mapper")
public class RootConfiguration {

    @Bean
    public Demo demo() {
        return new Demo();
    }
}
