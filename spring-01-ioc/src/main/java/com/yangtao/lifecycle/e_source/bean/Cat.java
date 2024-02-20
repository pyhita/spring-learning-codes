package com.yangtao.lifecycle.e_source.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Component
@Data
public class Cat {

    @Value("miaomiao")
    private String name;

    @Autowired
    private Person master;

}
