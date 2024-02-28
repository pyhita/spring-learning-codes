package com.yangtao.postprocessor.c_factoryprocessor.procesor;

import com.yangtao.postprocessor.c_factoryprocessor.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/21
 */
@Component
public class RemoveBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
        throws BeansException {
        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) beanFactory;

        for (String name : beanFactory.getBeanDefinitionNames()) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);

            if (Blue.class.getName().equals(beanDefinition.getBeanClassName())) {
                // Remove 符合条件的Bean Definition
                registry.removeBeanDefinition(name);
            }
        }
    }
}
