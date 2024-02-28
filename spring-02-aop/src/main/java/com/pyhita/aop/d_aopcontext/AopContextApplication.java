package com.pyhita.aop.d_aopcontext;

import com.pyhita.aop.d_aopcontext.config.AopContextConfiguration;
import com.pyhita.aop.d_aopcontext.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopContextApplication {
    
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            AopContextConfiguration.class);
        UserService userService = ctx.getBean(UserService.class);
        userService.update("abc", "def");
    }
}