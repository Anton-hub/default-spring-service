package com.moex.axelix.demo.default_spring_service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DefaultController {

    @GetMapping("/hello")
    public String sayHello() {
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("DEBUG");
        return "Hello!";
    }
}
