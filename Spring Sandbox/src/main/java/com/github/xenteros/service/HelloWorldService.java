package com.github.xenteros.service;

public class HelloWorldService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
