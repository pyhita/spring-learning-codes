package com.yangtao.basic_di.d_autowired.bean;

import java.util.List;
import java.util.Map;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
@Data
@Component
public class Dog {

    @Value("dog")
    private String name;
    @Autowired
    // @Qualifier("master")
    private Person per;

    // 注入所有的person
    @Autowired
    private List<Person> persons;
    @Autowired
    private Map<String, Person> personMap;

}
