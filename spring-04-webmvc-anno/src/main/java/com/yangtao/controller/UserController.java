package com.yangtao.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {


    @RequestMapping("/user/batchDelete")
    public String batchDelete(int[] ids) {
        System.out.println(ids);

        return "ids ...";
    }

}
