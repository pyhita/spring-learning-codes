package com.yangtao.configuration;

import com.yangtao.configuration.b_profile_conditional.component.Bartender;
import com.yangtao.configuration.b_profile_conditional.config.TavernConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class TavernApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        // 设置运行时环境
        ctx.getEnvironment().setActiveProfiles("city");
        ctx.register(TavernConfig.class);
        ctx.refresh();
        for (String name : ctx.getBeanNamesForType(Bartender.class)) {
            System.out.println(name);
        }
    }

}
