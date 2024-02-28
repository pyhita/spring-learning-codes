package com.yangtao.iocserviceprovider;

import com.yangtao.iocserviceprovider.bean.FXNewsListener;
import com.yangtao.iocserviceprovider.bean.FXNewsPersister;
import com.yangtao.iocserviceprovider.bean.FXNewsProvider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * @Author: kante_yang
 * @Date: 2024/2/20
 */
public class CodeIocContainer {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanFactory container = bindViaCode(beanFactory);

        // 从容器中获取Bean
        FXNewsProvider newsProvider = (FXNewsProvider) container.getBean("newsProvider");
        System.out.println(newsProvider.getFxNewsListener());
        System.out.println(newsProvider.getFxNewsPersister());

    }

    // 注入Bean定义信息，并且绑定Bean之间的依赖关系
    public static BeanFactory bindViaCode(BeanDefinitionRegistry registry) {
        AbstractBeanDefinition newsProvider = new RootBeanDefinition(FXNewsProvider.class);
        AbstractBeanDefinition newsListener = new RootBeanDefinition(FXNewsListener.class);
        AbstractBeanDefinition newsPersister = new RootBeanDefinition(FXNewsPersister.class);

        // 将Bean 定义注册到容器中
        registry.registerBeanDefinition("newsProvider", newsProvider);
        registry.registerBeanDefinition("newsListener", newsListener);
        registry.registerBeanDefinition("newsPersister", newsPersister);

        // 指定依赖关系
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0, newsListener);
        argumentValues.addIndexedArgumentValue(1, newsPersister);
        newsProvider.setConstructorArgumentValues(argumentValues);

        return (BeanFactory) registry;
    }

}
