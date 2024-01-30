package com.yangtao.configuration.e_spi;

import com.yangtao.configuration.e_spi.dao.DemoDao;
import java.util.List;
import org.springframework.core.io.support.SpringFactoriesLoader;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class SpringApplication {

    public static void main(String[] args) {
        // 加载并实例化
        List<DemoDao> demoDaos = SpringFactoriesLoader.loadFactories(DemoDao.class,
            SpringApplication.class.getClassLoader());
        for (DemoDao demoDao : demoDaos) {
            System.out.println(demoDao);
        }

        System.out.println("------------------------------------------------");

        // 只加载全限定类名
        List<String> daoClassNames = SpringFactoriesLoader
            .loadFactoryNames(DemoDao.class, SpringApplication.class.getClassLoader());
        daoClassNames.forEach(className -> {
            System.out.println(className);
        });
    }
}
