package com.yangtao.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class BeanFactory {

    private static Properties properties = new Properties();
    // 缓存区 缓存单例对象
    private static Map<String, Object> beanMap = new HashMap<>();

    static {
        try {
            InputStream ins = BeanFactory.class.getClassLoader().getResourceAsStream("factory.properties");
            properties.load(ins);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object getBean(String beanName) {
        try {
            // DCL 确保只有一个对象被实例化
            if (!beanMap.containsKey(beanName)) {
                synchronized (BeanFactory.class) {
                    if (!beanMap.containsKey(beanName)) {
                        Class<?> clazz = Class.forName(properties.getProperty(beanName));
                        beanMap.put(beanName, clazz.newInstance());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return beanMap.get(beanName);
    }

}
