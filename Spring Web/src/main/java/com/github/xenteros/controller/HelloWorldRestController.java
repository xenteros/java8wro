package com.github.xenteros.controller;

import com.github.xenteros.dto.NameDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
class HelloWorldRestController {

    @RequestMapping(method = RequestMethod.GET, value = "hello-name")
    public String helloWorld(
            @RequestParam(name = "name",
                    required = false,
                    defaultValue = "Anonymous") String name) {
        return "Hello " + name;
    }

    @GetMapping("/hello-name/{name}")
    public String helloWorldVariable(@PathVariable String name) {
        return "Hello " + name + " - variable";
    }

    @PostMapping("/hello-name-body")
    public String helloName(@RequestBody NameDto name) {
        return "Hello " + name.getName();
    }


    @GetMapping("/status/annotation")
    @ResponseStatus(HttpStatus.CREATED)
    public String helloStatusAnnotation() {
        return "Hello World!";
    }

    @GetMapping("/status/entity")
    public ResponseEntity<String> helloStatusEntity() {
        return new ResponseEntity<>("Hello World!", HttpStatus.CREATED);
    }

    @GetMapping("status/response")
    public String helloStatusResponse(HttpServletResponse response) {
        response.setStatus(201);
        return "Hello World";
    }


}
