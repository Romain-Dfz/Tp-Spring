// StudentController.java
package org.example.exerciceetudiantapplication.controller;

import org.example.exerciceetudiantapplication.repository.StudentRepository;
import org.example.exerciceetudiantapplication.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/students")
    public String listStudents(Model model) {
        List<Student> students = studentRepository.findAll();
        model.addAttribute("students", students);
        return "students";
    }

    @GetMapping("/students/{id}")
    public String showStudent(@PathVariable Long id, Model model) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student id"));
        model.addAttribute("student", student);
        return "student-details";
    }

}
