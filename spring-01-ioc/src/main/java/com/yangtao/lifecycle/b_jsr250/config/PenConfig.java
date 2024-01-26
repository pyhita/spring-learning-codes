package com.yangtao.lifecycle.b_jsr250.config;

import com.yangtao.lifecycle.b_jsr250.bean.Pen2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Configuration
public class PenConfig {
    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen2 pen2() {
        Pen2 pen2 = new Pen2();
        return pen2;
    }
}
