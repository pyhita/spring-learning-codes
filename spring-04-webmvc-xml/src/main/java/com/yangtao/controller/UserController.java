package com.yangtao.controller;

import com.yangtao.entity.User;
import com.yangtao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String list(Model model) {
        List<User> userList = userService.listUsers();
        model.addAttribute("userList", userList);
        return "user/userList";
    }

    @PostMapping("/save")
    public String save(@Validated User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().
                    forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            throw new RuntimeException("数据格式不正确");
        }
        System.out.println(user);
        return "redirect:/user/list";
    }




}
