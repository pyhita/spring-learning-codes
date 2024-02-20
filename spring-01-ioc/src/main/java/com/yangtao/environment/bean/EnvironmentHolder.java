package com.yangtao.environment.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Component
public class EnvironmentHolder {

    @Autowired
    private Environment environment;

    public void printEnv() {
        System.out.println(environment);
        System.out.println(environment.getProperty("jdbc.url"));
    }

}
