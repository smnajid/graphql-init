
package com.example.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Person;
import com.example.graphql.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class CreatePersonMutationResolver implements GraphQLMutationResolver {

    private final PersonService personService;

    public CreatePersonMutationResolver(final PersonService personService) {
        this.personService = personService;
    }

    public Person createPerson(final String firstName, final String lastName) {
        return personService.createPerson(firstName, lastName);
    }
}