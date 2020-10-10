package com.example.graphql.service;

import com.example.graphql.publishers.EventProcessor;
import com.example.graphql.query.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentLinkedQueue;

@Service
public class PersonService {
    private static int INDEX_COUNTER = 0;
    @Autowired
    private EventProcessor eventProcessor;

    private final Collection<Person> people = new ConcurrentLinkedQueue<>();

    public PersonService() {
        people.add(Person.builder().id(0).firstName("Mohamed").lastName("Najid").build());
        people.add(Person.builder().id(1).firstName("Anass").lastName("Najid").build());
    }

    public Person createPerson(final String firstName, final String lastName) {
        int id = people.size();
        final Person person = new Person(id, firstName, lastName, 0);
        people.add(person);
        eventProcessor.notifyEvent(person);
        return person;
    }

    public Person updateScore(Integer id, Integer score){
        Person person = people.stream().filter(p -> p.getId() == id).findAny().orElse(null);
        if (person != null) {
            person.setScore(score);
            eventProcessor.notifyEvent(person);
            return person;
        }
        return null;
    }

    public Collection<Person> getPeople() {
        return Collections.unmodifiableCollection(people);
    }
}