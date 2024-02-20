package com.yangtao.postprocessor.b_factorybean.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Component
public class FactoryBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        System.out.println("初始化之前拦截 bean is " + bean);
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        System.out.println("初始化之后拦截 bean is " + bean);
        return bean;
    }

}
