package com.yangtao.bean.c_instantiate.config;

import com.yangtao.bean.c_instantiate.bean.Car;
import com.yangtao.bean.c_instantiate.bean.CarInstanceFactory;
import com.yangtao.bean.c_instantiate.bean.CarStaticFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Configuration
public class InstantiateConfig {

    @Bean
    public Car car1() {

        return CarStaticFactory.getCar();
    }

    @Bean
    public Car car2() {
        return new Car();
    }

    @Bean
    public CarInstanceFactory carInstanceFactory() {
        return new CarInstanceFactory();
    }

    @Bean
    public Car car3(CarInstanceFactory carInstanceFactory) {
        return carInstanceFactory.getCar();
    }

}
