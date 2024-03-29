package com.pyhita.aop.d_aopcontext.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Service
public class UserService {

//    @Autowired
//    UserService userService;

    public void update(String id, String name) {
//        this.get(id);
//        userService.get(id);
        ((UserService) AopContext.currentProxy()).get(id);
        System.out.println("修改指定id的name。。。");
    }

    public void get(String id) {
        System.out.println("获取指定id的user。。。");
    }
}
