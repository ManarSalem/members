package com.example.address.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    String DTMEMBER_SERVICE_URL="http://localhost:8088/dt/from";

    @Bean
    public WebClient createWebClinet(){
        return WebClient.builder().baseUrl(DTMEMBER_SERVICE_URL).build();

    }
}
