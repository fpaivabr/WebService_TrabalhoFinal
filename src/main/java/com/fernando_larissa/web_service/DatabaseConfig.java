package com.fernando_larissa.web_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.jdbc.DataSourceBuilder;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .url("jdbc:postgresql://monorail.proxy.rlwy.net:10820/railway")
                .username("postgres")
                .password("EEzULYwRaRxbWsDlBqRjqErwlGeCBVRY")
                .driverClassName("org.postgresql.Driver")
                .build();
    }

    // Outras configurações do JPA, se necessário
}