package com.yangtao.configuration.b_profile_conditional.config;

import com.yangtao.configuration.a_module.component.Bar;
import com.yangtao.configuration.b_profile_conditional.conditional.BossConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Configuration
public class BarConfiguration {

    @Bean
    @Conditional(BossConditional.class)
    public Bar barr() {

        return new Bar();
    }
}
