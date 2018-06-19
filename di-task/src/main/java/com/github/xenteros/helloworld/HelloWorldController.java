package com.github.xenteros.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public String helloWorld() {
        return helloWorldService.getHelloWorld();
    }
}
