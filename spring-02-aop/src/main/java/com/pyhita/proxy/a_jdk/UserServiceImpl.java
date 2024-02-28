package com.pyhita.proxy.a_jdk;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class UserServiceImpl implements UseService{

    @Override
    public String login(String name) {
        System.out.println(name + " login successfully");
        return "success";
    }
}
