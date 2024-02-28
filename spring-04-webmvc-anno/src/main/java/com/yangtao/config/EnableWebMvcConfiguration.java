package com.yangtao.config;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.CacheControl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Duration;

@Configuration
@EnableWebMvc
@ComponentScan("com.yangtao.controller")
public class EnableWebMvcConfiguration implements WebMvcConfigurer {

    // 配置视图解析器
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.viewResolver(new InternalResourceViewResolver("/WEB-INF/pages/", "jsp"));
        registry.jsp("/WEB-INF/pages/", "jsp");

    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/**").addResourceLocations("/js/")
                .setCacheControl(CacheControl.maxAge(Duration.ofDays(30)));
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new String2DateConverter());
    }

    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
        validatorFactoryBean.setProviderClass(HibernateValidator.class);
        return validatorFactoryBean;
    }
}
