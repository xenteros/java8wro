package com.github.xenteros.helloworld;

import org.springframework.stereotype.Service;

@Service
class HelloWorldService {

    public String getHelloWorld() {
        return "Hello World!";
    }
}
