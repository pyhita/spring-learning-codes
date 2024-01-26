package com.yangtao.bean.a_type.bean;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: kante_yang
 * @Date: 2024/1/26
 */
@Data
public class ToyFactoryBean implements FactoryBean<Toy> {

    public ToyFactoryBean() {
        System.out.println("ToyFactoryBean 初始化了。。。");
    }

    private Child child;

    @Override
    public Toy getObject() throws Exception {
        switch (child.getWantToy()) {
            case "ball":
                return new Ball("ball");
            case "car":
                return new Car("car");
            default:
                return null;
        }
    }

    @Override
    public Class<?> getObjectType() {
        return Toy.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
