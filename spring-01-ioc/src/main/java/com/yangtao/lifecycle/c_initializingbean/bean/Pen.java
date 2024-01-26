package com.yangtao.lifecycle.c_initializingbean.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen implements InitializingBean, DisposableBean {

    @Value("10")
    private Integer ink;

    public Pen() {
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

    @Override
    public void destroy() throws Exception {
        System.out.println("钢笔中的墨水都放干净了。。。");
        this.ink = 0;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("钢笔中已加满墨水。。。");
        this.ink = 100;
    }
}
