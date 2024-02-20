package com.yangtao.configuration.b_profile_conditional.annotation;


import com.yangtao.configuration.b_profile_conditional.component.Boss;
import com.yangtao.configuration.b_profile_conditional.config.BartenderConfiguration;
import com.yangtao.configuration.b_profile_conditional.register.WaiterRegister;
import com.yangtao.configuration.b_profile_conditional.selector.BarSelector;
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
