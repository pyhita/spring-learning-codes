package com.yangtao.configuration.c_enablejdbc.condition;

import com.yangtao.configuration.c_enablejdbc.annotation.ConditionalOnClassName;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class OnClassNameConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String className = (String) metadata.getAnnotationAttributes(
            ConditionalOnClassName.class.getName()).get("value");
        try {
            Class.forName(className);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
