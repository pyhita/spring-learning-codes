package com.yangtao.annotation.g_propertysource.factory;

import java.io.IOException;
import java.util.Properties;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

/**
 * @Author: kante_yang
 * @Date: 2024/1/29
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource)
        throws IOException {
        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        // 传入resource 资源文件
        yamlPropertiesFactoryBean.setResources(encodedResource.getResource());
        // 获取转换后的 yaml文件
        Properties properties = yamlPropertiesFactoryBean.getObject();
        return new PropertiesPropertySource(
            name != null ? name : encodedResource.getResource().getFilename(), properties);
    }
}
