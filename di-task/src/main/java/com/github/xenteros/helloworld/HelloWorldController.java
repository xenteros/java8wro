package com.github.xenteros.helloworld;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    public String helloWorld() {
        return helloWorldService.getHelloWorld();
    }
}
