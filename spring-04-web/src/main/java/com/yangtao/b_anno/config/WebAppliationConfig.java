package com.yangtao.b_anno.config;

import com.yangtao.b_anno.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebAppliationConfig {

    @Bean
    public User user() {

        return new User();
    }
}
