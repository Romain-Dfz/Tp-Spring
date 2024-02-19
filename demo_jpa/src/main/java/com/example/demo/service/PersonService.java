package com.example.demo.service;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person findById(Long id);

    Person findById(int id);

    Person save(Person person);

    Person update(Long id, Person updatedPerson);

    void deleteById(Long id);
}
