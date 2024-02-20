package com.yangtao.basic_di.c_value_spel.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Data
@Component
public class Black {

    @Value("black")
    private String name;
    @Value("black")
    private String color;

}
