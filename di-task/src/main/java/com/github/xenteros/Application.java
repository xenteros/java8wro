package com.github.xenteros;

import com.github.xenteros.helloworld.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        HelloWorldController helloWorldController = ctx.getBean(HelloWorldController.class);
        System.out.println(helloWorldController.helloWorld());
    }
}
