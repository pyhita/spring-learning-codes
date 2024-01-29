package com.yangtao.configuration.a_module.annotation;

import com.yangtao.configuration.a_module.component.Boss;
import com.yangtao.configuration.a_module.config.BartenderConfiguration;
import com.yangtao.configuration.a_module.register.WaiterRegister;
import com.yangtao.configuration.a_module.selector.BarSelector;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({Boss.class, BartenderConfiguration.class, BarSelector.class, WaiterRegister.class})
public @interface EnableTavern {

}
