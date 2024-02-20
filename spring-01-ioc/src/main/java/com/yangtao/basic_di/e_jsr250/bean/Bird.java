package com.yangtao.basic_di.e_jsr250.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Component
@Data
public class Bird {

    private String name;
    
    private Person person;
}
