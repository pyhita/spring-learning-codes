package com.yangtao.basic_di.c_value_spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Data
@Component
public class Red {

    @Value("${red.name}")
    private String name;
    @Value("${red.color}")
    private String color;

}
