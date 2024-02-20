package com.yangtao.configuration.a_module.selector;

import com.yangtao.configuration.a_module.component.Bar;
import com.yangtao.configuration.a_module.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class BarSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[] {
            Bar.class.getName(),
            BarConfiguration.class.getName()
        };
    }
}
