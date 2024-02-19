package com.example.demo.service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonServiceImpl implements PersonService{

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    @Override
    public List<Person> findAll() {

        return personRepository.findAll();
    }

    @Override
    public Person findById(Long id) {
        return null;
    }

    @Override
    public Person findById(int id) {
        return personRepository.getReferenceById(id);
    }

    @Override
    public Person save(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person update(Long id, Person updatedPerson) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
