package com.example.demo_base_spring.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("greetings")
//@Primary
public class GreetingsServiceEnglish implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello everyone !!!";
    }
}
