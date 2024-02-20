package com.yangtao.postprocessor.c_factoryprocessor.procesor;

import com.yangtao.postprocessor.c_factoryprocessor.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
@Component
public class MyBeanDefiitionRegister implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry)
        throws BeansException {
        // RootBeanDefinition blueDefinitino = new RootBeanDefinition();
        // blueDefinitino.getPropertyValues().add("name", "blue");
        // blueDefinitino.setBeanClass(Blue.class);

        AbstractBeanDefinition blueDefinition = BeanDefinitionBuilder.genericBeanDefinition(
            Blue.class).getBeanDefinition();

        registry.registerBeanDefinition("blue", blueDefinition);
    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
        throws BeansException {
    }
}
