package com.github.xenteros.controller;

import com.github.xenteros.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    private MessageService messageService;

    @Autowired
    public HelloWorldController(MessageService messageService) {
        this.messageService = messageService;
    }

    public String getHelloWorld() {
        return messageService.getMessage();
    }

}
