package com.yangtao.postprocessor.c_factoryprocessor.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
@Component
public class Green extends Color{

    @Override
    public String toString() {
        return "Green{" + "name='" + name + '\'' + "}";
    }
}
