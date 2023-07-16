package com.happy.happylogging.yezy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean("dcn")
    public String driverClassName() {
        return driverClassName;
    }
}
