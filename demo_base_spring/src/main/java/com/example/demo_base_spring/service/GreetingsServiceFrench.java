package com.example.demo_base_spring.service;


import org.springframework.stereotype.Service;

@Service("salutations")
public class GreetingsServiceFrench implements GreetingsService{
    @Override
    public String sayHello() {
        return "Bonjour tout le monde !";
    }
}
