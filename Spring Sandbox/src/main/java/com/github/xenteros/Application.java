package com.github.xenteros;

import com.github.xenteros.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
//        HelloWorldController hwc = ctx.getBean(HelloWorldController.class);
        HelloWorldController hwc = (HelloWorldController) ctx.getBean("helloWorldController");
        System.out.println(hwc.getHelloWorld());

        for (String beanName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
