package com.yangtao.configuration.b_profile_conditional.conditional;

import com.yangtao.configuration.a_module.component.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class BossConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        return context.getBeanFactory().containsBeanDefinition(Boss.class.getName());
    }
}
