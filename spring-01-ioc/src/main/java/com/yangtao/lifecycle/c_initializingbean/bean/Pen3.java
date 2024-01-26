package com.yangtao.lifecycle.c_initializingbean.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen3 implements InitializingBean, DisposableBean {

    @Value("10")
    private Integer ink;

    public Pen3() {
        System.out.println("钢笔已经被实例化了。。。");
    }

    public void setInk(Integer ink) {
        System.out.println("钢笔属性被赋值。。。");
        this.ink = ink;
    }

    
    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }


    public void open() {
        System.out.println("init-method - 打开钢笔。。。");
    }

    public void close() {
        System.out.println("destroy-method - 合上钢笔。。。");
    }


    @PostConstruct
    public void addInk() {
        System.out.println("@PostConstruct - 钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("@PreDestroy - 钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - 准备写字。。。");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - 写完字了。。。");
    }


}
