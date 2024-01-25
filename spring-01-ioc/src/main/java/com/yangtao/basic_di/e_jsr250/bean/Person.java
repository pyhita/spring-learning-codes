package com.yangtao.basic_di.e_jsr250.bean;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Component("administrator")
@Primary
@Data
public class Person {
    private String name = "administrator";
}
