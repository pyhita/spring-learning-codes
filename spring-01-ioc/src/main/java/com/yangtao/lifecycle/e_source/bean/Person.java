package com.yangtao.lifecycle.e_source.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.Lifecycle;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class Person implements InitializingBean, DisposableBean, Lifecycle, BeanNameAware,
    BeanFactoryAware, ApplicationContextAware {


    private String name;
    private boolean state = false;

    private String beanName;
    private BeanFactory beanFactory;
    private ApplicationContext ctx;

    public Person() {
        System.out.println("Person constructor run ......");
    }

    public void setName(String name) {
        System.out.println("Person setName run ......");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Person @PostConstruct run ......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person InitializingBean run ......");
    }

    public void initMethod() {
        System.out.println("Person initMethod run ......");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Person @PreDestroy run ......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Person DisposableBean run ......");
    }

    public void destroyMethod() {
        System.out.println("Person destroyMethod run ......");
    }

    @Override
    public void start() {
        System.out.println("Person 睡醒起床了 ......");
        this.state = true;
    }

    @Override
    public void stop() {
        System.out.println("Person 睡觉去了 ......");
        this.state = false;
    }

    @Override
    public boolean isRunning() {
        return state;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Person setBeanFactory ......");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Person setBeanName ......");
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Person setApplicationContext ......");
        this.ctx = applicationContext;
    }
}
