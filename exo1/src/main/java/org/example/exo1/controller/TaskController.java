package org.example.exo1.controller;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TaskController {
    private List<Task> tasks = new ArrayList<>();
    private Long taskId = 0L;

    public TaskController() {
        tasks.add(new Task("Faire les courses"));
        tasks.add(new Task("Finir le rapport"));
        tasks.add(new Task("Appeler le client"));
    }

    @RequestMapping(value = "/tasks")
    public String getTasks(Model model) {
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.GET)
    public String getTask(@PathVariable Long id, Model model) {
        Task task = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Task not found"));
        model.addAttribute("task", task);
        return "task";
    }

    @PostMapping("/tasks")
    public String addTask(Task task) {
        task.setId(taskId++);
        tasks.add(task);
        return "redirect:/tasks";
    }

    @PostMapping("/tasks/{id}/complete")
    public String completeTask(@PathVariable Long id) {
        Task task = tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Task not found"));
        task.setCompleted(true);
        return "redirect:/tasks";
    }
}
