package com.yangtao.lifecycle.e_source.postprocessor;

import com.yangtao.lifecycle.e_source.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class LifecycleNameReadPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        if (bean instanceof Person) {
            Person person = (Person) bean;
            System.out.println("LifecycleNameReadPostProcessor ------> BeforeInitialization" + person.getName());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Person) {
            Person person = (Person) bean;
            System.out.println("LifecycleNameReadPostProcessor ------> AfterInitialization" + person.getName());
        }
        return bean;
    }
}
