package com.yangtao.lifecycle.a_initmethod.bean;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
public class Cat {

    private String name;

    public Cat() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println(name + "被初始化了。。。");
    }
    public void destroy() {
        System.out.println(name + "被销毁了。。。");
    }
}
