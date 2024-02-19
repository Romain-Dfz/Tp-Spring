package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PersonRestController {

    private final PersonService personService;

    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return personService.findAll();
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.findById(id);
    }

    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping("/persons/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        return personService.update(id, updatedPerson);
    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deleteById(id);
    }
}
