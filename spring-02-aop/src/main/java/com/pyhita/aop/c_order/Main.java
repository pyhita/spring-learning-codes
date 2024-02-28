package com.pyhita.aop.c_order;

import com.pyhita.aop.c_order.config.AspectJAOPConfiguration;
import com.pyhita.aop.c_order.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            AspectJAOPConfiguration.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.hello("tom");
    }

}
