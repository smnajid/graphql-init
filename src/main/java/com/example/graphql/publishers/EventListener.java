package com.example.graphql.publishers;

import com.example.graphql.query.Person;

public interface EventListener {
    void onEvent(Person person);
}
