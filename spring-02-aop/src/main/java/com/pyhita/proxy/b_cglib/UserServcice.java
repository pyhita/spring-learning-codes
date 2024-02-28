package com.pyhita.proxy.b_cglib;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class UserServcice {

    public String login(String name) {
        System.out.println(name + " login successfully");
        return "success";
    }
}
