package com.example.demo_base_spring.controller;

import com.example.demo_base_spring.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloControllerSet {

    // Injection de dépendence

    private final GreetingsService greetingsService;


    //@Autowired
    public HelloControllerSet(@Qualifier("salutations") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @RequestMapping(value = "/hello-set")
    public String sayHello(){
        System.out.println(greetingsService.sayHello());

        return "home";
    }
}
