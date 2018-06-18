package com.github.xenteros.configuration;

import com.github.xenteros.service.GoodByeWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("bye")
public class ByeConfiguration {

    @Bean
    GoodByeWorldService goodByeWorldService(){
        return new GoodByeWorldService();
    }
}
