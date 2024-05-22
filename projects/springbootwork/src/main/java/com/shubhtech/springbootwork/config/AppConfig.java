package com.shubhtech.springbootwork.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public String exampleBean(){
        return "Hello everyone welcome to bean ";
    }
}
