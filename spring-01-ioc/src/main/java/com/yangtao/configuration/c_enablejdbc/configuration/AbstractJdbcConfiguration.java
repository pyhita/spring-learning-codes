package com.yangtao.configuration.c_enablejdbc.configuration;

import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Configuration
@PropertySource(value = "classpath:propertysource/jdbc.properties")
public abstract class AbstractJdbcConfiguration implements EnvironmentAware {

    protected Environment environment;

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
