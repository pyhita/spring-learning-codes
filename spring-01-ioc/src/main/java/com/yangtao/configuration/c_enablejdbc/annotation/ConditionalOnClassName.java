package com.yangtao.configuration.c_enablejdbc.annotation;

import com.yangtao.configuration.c_enablejdbc.condition.OnClassNameConditional;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Conditional;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Conditional(OnClassNameConditional.class)
public @interface ConditionalOnClassName {
    String value();
}
