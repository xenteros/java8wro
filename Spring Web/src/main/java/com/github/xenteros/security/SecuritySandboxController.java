package com.github.xenteros.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security-sandbox")
class SecuritySandboxController {

    @GetMapping("/anyone")
    public String anyone(){
        return "Anyone can see it!";
    }

    @GetMapping("/authenticated")
    public String authenticated(){
        return "Only those authenticated can see it!";
    }

    @GetMapping("/welcome")
    public String welcome(){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        return "Hello " + auth.getName();
    }


}
