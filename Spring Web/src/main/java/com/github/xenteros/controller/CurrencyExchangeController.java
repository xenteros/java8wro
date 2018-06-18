package com.github.xenteros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/currency-exchanges")
class CurrencyExchangeController {

    /**
     * @param value - wartość w złotówkach
     * @return - wartość w euro
     */
    @GetMapping
    public BigDecimal exchange(@RequestParam Long value, @RequestParam String from) {
        RestTemplate restTemplate = new RestTemplate();
        return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(4));
    }

}
