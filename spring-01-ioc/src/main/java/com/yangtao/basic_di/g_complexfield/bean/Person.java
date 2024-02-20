package com.yangtao.basic_di.g_complexfield.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import lombok.Data;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Data
public class Person {

    private String[] names;
    private List<String> tels;
    private Set<Cat> cats;
    private Map<String, Object> events;
    private Properties props;

}
