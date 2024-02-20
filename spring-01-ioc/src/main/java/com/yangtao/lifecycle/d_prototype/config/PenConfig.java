package com.yangtao.lifecycle.d_prototype.config;

import com.yangtao.lifecycle.d_prototype.bean.Pen;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Configuration
public class PenConfig {

    @Bean(initMethod = "open", destroyMethod = "close")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Pen pen() {

        return new Pen();
    }
}
