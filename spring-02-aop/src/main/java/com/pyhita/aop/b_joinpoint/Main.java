package com.pyhita.aop.b_joinpoint;

import com.pyhita.aop.b_joinpoint.config.AspectJAOPConfiguration;
import com.pyhita.aop.b_joinpoint.service.FinanceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class Main {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
            AspectJAOPConfiguration.class);
        FinanceService financeService = ctx.getBean(FinanceService.class);
        financeService.addMoney(123.45);
    }

}
