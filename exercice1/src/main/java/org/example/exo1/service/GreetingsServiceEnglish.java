package org.example.exo1.service;


import org.springframework.stereotype.Service;

@Service("greetings")
public class GreetingsServiceEnglish implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello everyone !!!";
    }
}
