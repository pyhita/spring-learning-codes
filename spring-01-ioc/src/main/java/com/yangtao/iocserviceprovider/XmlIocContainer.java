package com.yangtao.iocserviceprovider;

import com.yangtao.iocserviceprovider.bean.FXNewsProvider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @Author: kante_yang
 * @Date: 2024/2/20
 */
public class XmlIocContainer {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanRegistry = new DefaultListableBeanFactory();
        BeanFactory container = bindViaXMLFile(beanRegistry);

        FXNewsProvider newsProvider = (FXNewsProvider) container.getBean("newsProvider");
        System.out.println(newsProvider.getFxNewsPersister());
        System.out.println(newsProvider.getFxNewsListener());
    }

    public static BeanFactory bindViaXMLFile(BeanDefinitionRegistry registry) {
        // load xml file, parse bean definition
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        reader.loadBeanDefinitions("classpath:/iocserviceprovider/beans.xml");
        return (BeanFactory) registry;
    }

}
