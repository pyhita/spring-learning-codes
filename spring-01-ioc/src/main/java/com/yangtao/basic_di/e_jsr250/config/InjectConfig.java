package com.yangtao.basic_di.e_jsr250.config;

import com.yangtao.basic_di.e_jsr250.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Configuration
@ComponentScan(value = "com.yangtao.basic_di.d_autowired.bean")
public class InjectConfig {
    @Bean
    public Person master() {
        Person person = new Person();
        person.setName("master");

        return person;
    }
}
