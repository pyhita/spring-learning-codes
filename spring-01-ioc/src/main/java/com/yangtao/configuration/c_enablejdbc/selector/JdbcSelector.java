package com.yangtao.configuration.c_enablejdbc.selector;

import com.yangtao.configuration.c_enablejdbc.annotation.EnableJdbc;
import java.util.List;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
public class JdbcSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> jdbcConfigurationNames = SpringFactoriesLoader.loadFactoryNames(EnableJdbc.class,
            JdbcSelector.class.getClassLoader());

        return jdbcConfigurationNames.toArray(new String[0]);
    }
}
