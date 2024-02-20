package com.yangtao.postprocessor.a_quickstart.processsor;

import com.yangtao.postprocessor.a_quickstart.bean.Cat;
import com.yangtao.postprocessor.a_quickstart.bean.Dog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Component
public class DemoPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {

        if (bean instanceof Dog) {
            System.out.println("拦截之前 bean is " + bean);
            return new Cat();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        System.out.println("拦截之后 bean is " + bean);
        return bean;
    }
}
