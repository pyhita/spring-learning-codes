package com.yangtao.basic_di.g_complexfield.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Component
public class Person2 {

    @Value("#{new String[] {'张三', '张仨'}}")
    private String[] names;

    @Value("#{{'333333', '3333', '33'}}")
    private List<String> tels;

    // 引用现有的Bean，以及创建新的Bean
    @Value("#{{@cat, new com.yangtao.basic_di.g_complexfield.bean.Cat()}}")
    private Set<Cat> cats;

    @Value("#{{'喵喵': @cat.name, '猫猫': new com.yangtao.basic_di.g_complexfield.bean.Cat().name}}")
    private Map<String, Object> events;

    @Value("#{{'123': '牵着手', '456': '抬起头', '789': '我们私奔到月球'}}")
    private Properties props;

}
