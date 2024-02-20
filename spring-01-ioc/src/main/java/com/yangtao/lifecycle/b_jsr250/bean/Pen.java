package com.yangtao.lifecycle.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {

    @Value("10")
    private Integer ink;

    public Pen() {
        System.out.println("钢笔已经被实例化了。。。");
    }

    public void setInk(Integer ink) {
        System.out.println("钢笔属性被赋值。。。");
        this.ink = ink;
    }


    @PostConstruct
    public void addInk() {
        System.out.println("钢笔中已加满墨水。。。");
        this.ink = 100;
    }

    @PreDestroy
    public void outwellInk() {
        System.out.println("钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }
    
    @Override
    public String toString() {
        return "Pen{" + "ink=" + ink + '}';
    }
}
