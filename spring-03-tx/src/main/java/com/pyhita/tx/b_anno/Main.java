package com.pyhita.tx.b_anno;

import com.pyhita.tx.b_anno.config.TxConfiguration;
import com.pyhita.tx.b_anno.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/3/20
 */
public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            TxConfiguration.class);

        UserService userService = ctx.getBean(UserService.class);
        userService.saveAndQuery();
    }

}
