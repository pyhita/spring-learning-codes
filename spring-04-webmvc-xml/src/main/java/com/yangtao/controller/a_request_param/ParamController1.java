package com.yangtao.controller.a_request_param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/param1")
public class ParamController1 {


    // 1 基于原生类型收集参数
    // http://localhost:8080/mvc/param1/test1?name=zhnagsan&age=22&height=1.99
    @RequestMapping("/test1")
    public void test1(String name, Integer age, Double height) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }


    // 2 基于POJO类型接收参数
    // http://localhost:8080/mvc/param1/test2?name=zhnagsan&age=22
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    static class Person {
        private String name;
        private Integer age;
    }

    @RequestMapping("/test2")
    public Person test2(Person person) {
        System.out.println(person);
        return person;
    }

    // 3 接受一组简单变量
    //http://localhost:8080/mvc/param1/test3?ids=1&ids=2
    @RequestMapping("/test3")
    public Integer[] test3(Integer[] ids) {
        System.out.println(ids);

        return ids;
    }

    // List<Integer> 和 ArrayList<Integer> 都不行！
    @RequestMapping("/test4")
    public List<Integer> test4(List<Integer> ids) {
        System.out.println(ids);

        return ids;
    }

    // 4 接受一组POJO
    @RequestMapping("/test5")
    public List<Person> test5(List<Person> persons) {
        System.out.println(persons);
        return persons;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class UserVo {
        private List<Person> persons;
    }

    @RequestMapping("/test6")
    public UserVo test6(UserVo userVo) {
        System.out.println(userVo);
        return userVo;
    }

    @RequestMapping("/test7")
    public List<Person> test7(@RequestBody List<Person> persons) {
        System.out.println(persons);

        return persons;
    }


    // 5 @RequstParam注解
    // 1 接受querystring 中的参数：
    // http://localhost:8080/mvc/param1/test8?name=kante&age=11
    @GetMapping("/test8")
    public String test8(
            @RequestParam(value = "name", defaultValue = "kante", required = true) String username,
            @RequestParam(value = "age", defaultValue = "22", required = false) Integer age
    ) {
        System.out.println(username + " " + age);

        return username + " " + age;
    }

    // post 请求 请求体一样可以拿到
    @PostMapping("/test9")
    public String test9(
            @RequestParam(value = "name", defaultValue = "kante", required = true) String username,
            @RequestParam(value = "age", defaultValue = "22", required = false) Integer age
    ) {
        System.out.println(username + " " + age);

        return username + " " + age;
    }

    // 6 @PathVariable
    //
    @GetMapping("/test10/{name}")
    public String test10(@PathVariable("name") String username) {
        System.out.println(username);

        return username;
    }


    // 7 类型转换器
    @GetMapping("/test11")
    public String test11(Date date) {
        System.out.println(date);

        return "test";
    }


    // 8 动态参数
    // 单值动态参数
    /**
     * http://localhost:8989/param/param2/param1?name=sunshuai
     * http://localhost:8989/param/param2/param1?age=10
     *
     */
    // {name=kante, age=22}
    @GetMapping("/test12")
    public String test12(@RequestParam Map<String, String> param) {
        System.out.println(param);

        return "test";
    }

    // 多值动态参数 ： 数组或者Map
    // http://localhost:8989/param/param10?name=sunshuai1&name=sunshuai2&name=sunshuai3
    // http://localhost:8080/mvc/param1/test13?name=kante&name=liam&age=33
    // {name=[kante, liam], age=[33]}
    @GetMapping("/test13")
    public String test13(@RequestParam MultiValueMap<String, String> params) {
        System.out.println(params);

        return "test";
    }

    // 9 接受Cookie数据
    @RequestMapping("/test13")
    public String test13(@CookieValue("name") String username) {
        System.out.println(username);

        return "cookie";
    }

    // 10 RequestHeader数据
    @RequestMapping("/test14")
    public String test14(@RequestHeader("name") String username) {
        System.out.println(username);

        return "header";
    }



}
