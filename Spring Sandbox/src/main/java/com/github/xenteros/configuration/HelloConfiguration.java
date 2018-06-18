package com.github.xenteros.configuration;

import com.github.xenteros.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hello")
public class HelloConfiguration {

    @Bean
    HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }
}
