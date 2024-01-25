package com.yangtao.basic_dl.c_oftype;

import com.yangtao.basic_dl.c_oftype.dao.DemoDao;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/25
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/c_ofType.xml");
        Map<String, DemoDao> beansMap = ctx.getBeansOfType(DemoDao.class);

        beansMap.forEach((key, value) -> {
            System.out.println(value);
        });
    }

}
