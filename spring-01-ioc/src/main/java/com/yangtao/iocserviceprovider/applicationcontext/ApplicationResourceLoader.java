package com.yangtao.iocserviceprovider.applicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * @Author: kante_yang
 * @Date: 2024/2/21
 */
// ApplicationContext 可以当做ResourceLoader使用
public class ApplicationResourceLoader {

    public static void main(String[] args) {
        ResourceLoader resourceLoader = new ClassPathXmlApplicationContext("");
        resourceLoader.getResource("xxxx/path");

    }
}
