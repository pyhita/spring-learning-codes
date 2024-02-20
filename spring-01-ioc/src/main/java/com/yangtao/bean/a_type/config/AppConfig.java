package com.yangtao.bean.a_type.config;

import com.yangtao.bean.a_type.bean.Child;
import com.yangtao.bean.a_type.bean.ToyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Configuration
public class AppConfig {


    @Bean
    public Child child() {
        Child child = new Child();
        child.setWantToy("car");
        return child;
    }

    // @Bean
    // public Car car() {
    //     return new Car("car");
    // }

    @Bean
    public ToyFactoryBean toyFactory(Child child) {
        ToyFactoryBean factoryBean = new ToyFactoryBean();
        factoryBean.setChild(child);
        return factoryBean;
    }

}
