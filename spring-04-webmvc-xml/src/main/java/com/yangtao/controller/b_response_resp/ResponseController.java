package com.yangtao.controller.b_response_resp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resp")
public class ResponseController {


    // controller forward jsp
    @RequestMapping("/m1")
    public String m1() {
        System.out.println("....");

        return "viewName";
    }

    // controller redirect jsp
    @RequestMapping("/m2")
    public String m2() {
        System.out.println("....");

        return "redirect:viewName";
    }

    // controller forward controller
    @RequestMapping("/forward1")
    public String forward1() {
        System.out.println("从forward1开始跳转");
        return "forward:/forwardController/forward2";
    }

    @RequestMapping("/forward2")
    public String forward2() {
        System.out.println("跳转到forward2中");
        return "forward2";// /forward2.jsp
    }

    // controller redirect controller
    @RequestMapping("/redirect1")
    public String redirect1() {
        System.out.println("从redirect1开始跳转");
        return "redirect:/redirectController/redirect2";
    }

    @RequestMapping("/redirect2")
    public String redirect2() {
        System.out.println("跳转到redirect2中");
        return "redirect2";
    }

}
