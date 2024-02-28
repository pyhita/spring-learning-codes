package com.yangtao.postprocessor.c_factoryprocessor.procesor;

import com.yangtao.postprocessor.c_factoryprocessor.bean.Color;
import java.util.stream.Stream;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

/**
 * @Author: kante_yang
 * @Date: 2024/2/19
 */
@Component
public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
        throws BeansException {

        // 设置 color bean的name
        Stream.of(beanFactory.getBeanDefinitionNames()).forEach(beanName -> {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
            if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
                if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(), this.getClass().getClassLoader())
                    .getSuperclass().equals(
                        Color.class)) {
                    // enrich bean name info
                    beanDefinition.getPropertyValues().add("name", beanName);
                }
            }
        });
    }
}
