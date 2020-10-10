
package com.example.graphql.mutation;

import com.example.graphql.query.Person;
import com.example.graphql.service.PersonService;
import graphql.kickstart.tools.GraphQLMutationResolver;
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

    public Person updateScore(Integer id, Integer score){
        return personService.updateScore(id, score);
    }
}
