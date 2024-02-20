package com.yangtao.configuration.c_enablejdbc.configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.yangtao.configuration.c_enablejdbc.annotation.ConditionalOnClassName;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: kante_yang
 * @Date: 2024/1/30
 */
@Configuration
@ConditionalOnClassName(value = "com.mysql.jdbc.Driver")
public class MySqlJdbcConfiguration extends AbstractJdbcConfiguration {
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(environment.getProperty("com.mysql.jdbc.Driver"));
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));

        return dataSource;
    }
}
