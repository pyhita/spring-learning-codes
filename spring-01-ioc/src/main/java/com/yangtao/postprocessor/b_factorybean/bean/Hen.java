package com.yangtao.postprocessor.b_factorybean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Component
public class Hen implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Egg();
    }

    @Override
    public Class<?> getObjectType() {
        return Egg.class;
    }
}
