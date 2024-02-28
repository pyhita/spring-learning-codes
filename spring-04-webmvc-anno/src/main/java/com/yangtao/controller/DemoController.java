package com.yangtao.controller;

import com.yangtao.entity.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private Demo demo;

    @RequestMapping("/test")
    public String test() {
        System.out.println("demo ..... " + demo);
        return "demo";
    }

}
