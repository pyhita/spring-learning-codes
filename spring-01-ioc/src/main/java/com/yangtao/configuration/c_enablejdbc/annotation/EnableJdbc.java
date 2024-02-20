package com.yangtao.configuration.c_enablejdbc.annotation;

import com.yangtao.configuration.c_enablejdbc.selector.JdbcSelector;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// @Import(AbstractJdbcConfiguration.class)
@Import(JdbcSelector.class)
public @interface EnableJdbc {

}
