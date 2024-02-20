package com.yangtao.lifecycle.e_source;

import com.yangtao.lifecycle.e_source.bean.Cat;
import com.yangtao.lifecycle.e_source.bean.Person;
import com.yangtao.lifecycle.e_source.config.LifecycleSourceConfiguration;
import com.yangtao.lifecycle.e_source.postprocessor.LifecycleDestructionPostProcessor;
import com.yangtao.lifecycle.e_source.postprocessor.LifecycleNameReadPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("IoC容器启动========================");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(LifecycleSourceConfiguration.class);
        ctx.register(LifecycleDestructionPostProcessor.class);
        ctx.register(LifecycleNameReadPostProcessor.class);

        System.out.println("================准备刷新IOC容器==================");

        ctx.refresh();

        System.out.println("================IOC容器刷新完毕==================");

        ctx.start();

        System.out.println("================IOC容器启动完成==================");

        Person person = ctx.getBean(Person.class);
        System.out.println(person);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        System.out.println("================准备停止IOC容器==================");

        ctx.stop();

        System.out.println("================IOC容器停止成功==================");

        ctx.close();
    }

}
