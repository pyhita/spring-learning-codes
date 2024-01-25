package com.yangtao.basic_dl.d_withanno;

import com.yangtao.basic_dl.d_withanno.anno.Color;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/d_withano.xml");
        Map<String, Object> beansWithAnnotation = ctx.getBeansWithAnnotation(Color.class);

        beansWithAnnotation.forEach((name, bean) -> {
            System.out.println(name + " " + bean);
        });
    }
}
