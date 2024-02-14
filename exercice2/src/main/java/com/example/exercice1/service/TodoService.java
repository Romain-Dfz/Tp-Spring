package com.example.exercice1.service;


import com.example.exercice1.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

    private ArrayList<Todo> todos = new ArrayList<>();

    public TodoService() {
        this.todos.add(new Todo("test7","description7",true));
        this.todos.add(new Todo("test8","description8",true));
        this.todos.add(new Todo("test9","description9",true));
    }

    public ArrayList<Todo> getTodos() {
        return todos;
    }

    public void setTodos(ArrayList<Todo> todos) {
        this.todos = todos;
    }
}
