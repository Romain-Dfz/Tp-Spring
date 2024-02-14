package com.example.exercice1.controller;


import com.example.exercice1.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/base")
public class TodoRestController {



    @GetMapping("todo")
    public Todo getTodo(){
        return new Todo("test1","description1",true);
    }

    @GetMapping("todos")
    public List<Todo> getTodos(){
        return List.of(new Todo("test2","description2",false),
                new Todo("test3","description3",true),
                new Todo("test4","description4",false));
    }
}
