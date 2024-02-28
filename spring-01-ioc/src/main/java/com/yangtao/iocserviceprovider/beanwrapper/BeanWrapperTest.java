package com.yangtao.iocserviceprovider.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

/**
 * @Author: kante_yang
 * @Date: 2024/2/21
 */
public class BeanWrapperTest {

    public static void main(String[] args) throws Exception {
        Object provider = Class.forName("com.yangtao.iocserviceprovider.bean.FXNewsProvider")
            .newInstance();
        Object listener = null;
        Object persister = null;

        BeanWrapper newsProvider = new BeanWrapperImpl(provider);
        newsProvider.setPropertyValue("newsListener", listener);
        newsProvider.setPropertyValue("newsPersister", persister);
    }

}
