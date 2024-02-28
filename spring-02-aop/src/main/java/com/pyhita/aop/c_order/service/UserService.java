package com.pyhita.aop.c_order.service;

import com.pyhita.aop.c_order.component.Log;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Component
public class UserService {

    @Log
    public void hello(String name) {
        System.out.println("hello, " + name);
    }

}
