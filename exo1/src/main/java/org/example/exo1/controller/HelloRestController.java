package org.example.exo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/todo-leloup")
public class HelloRestController {

    @GetMapping
    public String sayHello(){
        System.out.println("hello");
        return "Salut l'équipe !!!!!";
    }

    @GetMapping(value = "persons")
    public List<String> sayCoucouJson(){
        return List.of("Titi Nicolas","Toto Doe","Tata Dae");
    }
}
