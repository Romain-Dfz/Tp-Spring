package com.example.exercice1.controller;


import com.example.exercice1.model.Todo;
import com.example.exercice1.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping("/todo")
    public String getOneTodo(Model model){
        Todo todo = new Todo("test5","description5",true);
        model.addAttribute("titre",todo.getName());
        model.addAttribute("description",todo.getDescription());
        if (todo.isDone()){
            model.addAttribute("status","fini");
        }else {
            model.addAttribute("status","en cours");
        }
        model.addAttribute("todo",new Todo("test6","description6",true));
        return "todo/todo";
    }

    @GetMapping("alltodos")
    @ResponseBody
    public List<Todo> getAllTodos(){
        return todoService.getTodos();
    }



}
