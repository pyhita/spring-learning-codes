package com.pyhita.aop.a_aspectj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
@Configuration
@ComponentScan("com.pyhita.aop.a_aspectj")
@EnableAspectJAutoProxy
public class AspectJAOPConfiguration {

}
