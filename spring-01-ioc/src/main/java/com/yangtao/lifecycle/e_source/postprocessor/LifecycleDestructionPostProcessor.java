package com.yangtao.lifecycle.e_source.postprocessor;

import com.yangtao.lifecycle.e_source.bean.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.core.Ordered;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class LifecycleDestructionPostProcessor implements DestructionAwareBeanPostProcessor,
    Ordered {

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        if (bean instanceof Cat) {
            Cat cat = (Cat) bean;
            System.out.println(cat.getName() + "被放走了 ......");
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
