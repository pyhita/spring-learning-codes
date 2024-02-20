package com.yangtao.configuration.a_module.register;

import com.yangtao.configuration.a_module.component.Waiter;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class WaiterRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
        BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
    }
}
