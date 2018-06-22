package com.github.xenteros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@EnableWebSecurity
class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    //    @Scheduled(fixedRate = 10000L)
    @Scheduled(cron = "0 * * * * ?")
    public void scheduled() {
        System.out.println("Minęło 10 sekund");
    }

    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("greetings")
                .apiInfo(apiInfo())
                .select()
                .paths(regex("/api.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .description("Simple REST API to learn")
                .title("Rent a book")
                .build();
    }

    @Autowired
    public void getUserDetailsService(UserDetailsService userDetailsService) {
        System.out.println(userDetailsService);
    }
}
