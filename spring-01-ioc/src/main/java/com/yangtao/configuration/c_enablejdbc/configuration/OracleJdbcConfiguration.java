package com.yangtao.configuration.c_enablejdbc.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.yangtao.configuration.c_enablejdbc.annotation.ConditionalOnClassName;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClassName("oracle.jdbc.driver.OracleDriver")
public class OracleJdbcConfiguration extends AbstractJdbcConfiguration {
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }
}