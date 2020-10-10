package com.example.graphql.publishers;

import com.example.graphql.query.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventProcessor {

    private List<EventListener> listeners = new ArrayList<>();

    public void register(EventListener listener){
        listeners.add(listener);
    }

    public void notifyEvent(Person person){
        listeners.forEach(l -> l.onEvent(person));
    }
}
