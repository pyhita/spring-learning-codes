package com.yangtao.lifecycle.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen2 {

    @Value("10")
    private Integer ink;

    public Pen2() {
        System.out.println("钢笔已经被实例化了。。。");
    }

    public void setInk(Integer ink) {
        System.out.println("钢笔属性被赋值。。。");
        this.ink = ink;
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
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}
