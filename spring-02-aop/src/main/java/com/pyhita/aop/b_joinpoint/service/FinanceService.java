package com.pyhita.aop.b_joinpoint.service;

import com.pyhita.aop.b_joinpoint.component.Log;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Component
public class FinanceService {

    public void addMoney(double money) {
        System.out.println("FinanceService 收钱 === " + money);
    }

    @Log
    public double subtractMoney(double money) {
        System.out.println("FinanceService 付钱 === " + money);
        return money;
    }

    public double subtractMoney(double money, String id) throws Exception {
        System.out.println("FinanceService 付钱 === " + money);
        return money;
    }

    public double getMoneyById(String id) {
        System.out.println("FinanceService 查询账户，id为" + id);
        return Math.random();
    }
}