package com.yangtao.lifecycle.c_initializingbean.config;

import com.yangtao.lifecycle.c_initializingbean.bean.Pen3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Configuration
public class PenConfig {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen3 pen3() {
        Pen3 pen3 = new Pen3();
        return pen3;
    }

}
