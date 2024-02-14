package org.example.exo1.controller;

import org.example.exo1.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControllerSet {
    private final GreetingsService greetingsService;


    //@Autowired
    public HelloControllerSet(@Qualifier("salutations") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @RequestMapping(value = "/hola-set")
    public String sayHello() {
        System.out.println(greetingsService.sayHello());

        return "home";

    }
}
