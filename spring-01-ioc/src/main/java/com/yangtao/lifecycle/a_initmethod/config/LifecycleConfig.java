package com.yangtao.lifecycle.a_initmethod.config;

import com.yangtao.lifecycle.a_initmethod.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Configuration
public class LifecycleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Cat cat() {
        Cat cat = new Cat();
        cat.setName("mini");
        return cat;
    }

}
