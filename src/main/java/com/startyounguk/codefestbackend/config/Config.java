package com.startyounguk.codefestbackend.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean("restTemplates")
    public RestTemplate restTemplate(RestTemplateBuilder builder) {return builder.build(); }

}
