
package com.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.Collection;

import com.example.graphql.model.Person;
import com.example.graphql.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonQueryResolver implements GraphQLQueryResolver {

    private final PersonService personService;

    public PersonQueryResolver(final PersonService personService) {
        this.personService = personService;
    }

    public Collection<Person> people() {
        return personService.getPeople();
    }
}
