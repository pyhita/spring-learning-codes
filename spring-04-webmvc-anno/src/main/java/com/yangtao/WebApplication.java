package com.yangtao;

import com.yangtao.config.EnableWebMvcConfiguration;
import com.yangtao.config.RootConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebApplication extends AbstractAnnotationConfigDispatcherServletInitializer {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{EnableWebMvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}