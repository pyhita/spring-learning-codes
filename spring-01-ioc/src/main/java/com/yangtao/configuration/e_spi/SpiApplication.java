package com.yangtao.configuration.e_spi;

import com.yangtao.configuration.e_spi.dao.DemoDao;
import java.util.ServiceLoader;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class SpiApplication {

    public static void main(String[] args) {
        ServiceLoader<DemoDao> serviceLoader = ServiceLoader.load(DemoDao.class);
        serviceLoader.iterator().forEachRemaining(dao -> {
            System.out.println(dao);
        });
    }
}
