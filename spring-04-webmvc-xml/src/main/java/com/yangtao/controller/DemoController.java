package com.yangtao.controller;

import com.yangtao.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dmeo")
public class DemoController {

    @Autowired
    private Demo demo;

    @RequestMapping("/d1")
    public String demo01() {
        System.out.println(demo);
        System.out.println("请求过来了");
        return "index";
    }
}
