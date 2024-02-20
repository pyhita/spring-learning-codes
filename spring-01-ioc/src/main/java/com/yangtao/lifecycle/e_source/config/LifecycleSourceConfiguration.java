package com.yangtao.lifecycle.e_source.config;

import com.yangtao.lifecycle.e_source.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Configuration
@ComponentScan("com.yangtao.lifecycle.e_source.bean")
public class LifecycleSourceConfiguration {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public Person person() {
        Person person = new Person();
        person.setName("lisi");
        return person;
    }
}
