package com.yangtao.configuration.a_module.config;

import com.yangtao.configuration.a_module.component.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Configuration
public class BarConfiguration {

    @Bean
    public Bar barr() {

        return new Bar();
    }
}
