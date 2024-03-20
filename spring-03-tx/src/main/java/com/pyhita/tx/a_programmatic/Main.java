package com.pyhita.tx.a_programmatic;

import com.pyhita.tx.a_programmatic.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/3/20
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            "classpath:app.xml");

        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }

}
